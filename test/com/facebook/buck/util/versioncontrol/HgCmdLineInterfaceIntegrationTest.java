import static org.junit.Assert.assertNull;
import com.google.common.collect.ImmutableList;
import org.junit.Rule;
import org.junit.rules.ExpectedException;
import java.nio.charset.Charset;
import java.nio.file.Paths;
import java.util.List;

  @Rule
  public ExpectedException exception = ExpectedException.none();

    exception.expect(VersionControlCommandFailedException.class);
    repoThreeCmdLine.diffBetweenRevisions("adf7a0", "adf7a0");
  public void testDiffBetweenDiffs()
    ImmutableList<String> expectedValue = ImmutableList.of(
        "# HG changeset patch",
        "# User Joe Blogs <joe.blogs@fb.com>",
        "# Date 1440589545 -3600",
        "#      Wed Aug 26 12:45:45 2015 +0100",
        "# Node ID 2911b3cab6b24374a3649ebb96b0e53324e9c02e",
        "# Parent  b1fd7e5896af8aa30e3e797ef1445605eec6d055",
        "diverge from master_2",
        "",
        "diff --git a/change2 b/change2",
        "new file mode 100644",
        "");
        String.join("\n", expectedValue),
        repoThreeCmdLine.diffBetweenRevisions("b1fd7e", "2911b3"));
  @Test
  public void testExtractRawManifestNoChanges()
    throws VersionControlCommandFailedException, InterruptedException, IOException {
    HgCmdLineInterface hgCmdLineInterface = (HgCmdLineInterface) repoTwoCmdLine;
    String path = hgCmdLineInterface.extractRawManifest();
    List<String> lines = Files.readAllLines(
        Paths.get(path),
        Charset.forName(System.getProperty("file.encoding", "UTF-8"))
    );
    List<String> expected = ImmutableList.of(
        "change2\0b80de5d138758541c5f05265ad144ab9fa86d1db",
        "file1\0b80de5d138758541c5f05265ad144ab9fa86d1db",
        "file2\0b80de5d138758541c5f05265ad144ab9fa86d1db"
    );
    assertEquals(lines, expected);
  }

  @Test
  public void testExtractRawManifestFileRenamed()
      throws VersionControlCommandFailedException, InterruptedException, IOException {
    // In order to make changes without affecting other tests, extract a new repository copy
    Path localTempFolder = Files.createTempDirectory(tempFolder.getRoot().toPath(), "temp-repo");
    Path localReposPath = explodeReposZip(localTempFolder);
    Files.delete(localReposPath.resolve(REPO_TWO_DIR + "/file1"));

    HgCmdLineInterface hgCmdLineInterface = (HgCmdLineInterface) makeCmdLine(
        localReposPath.resolve(REPO_TWO_DIR));

    String path = hgCmdLineInterface.extractRawManifest();
    List<String> lines = Files.readAllLines(
        Paths.get(path),
        Charset.forName(System.getProperty("file.encoding", "UTF-8"))
    );
    List<String> expected = ImmutableList.of(
        "change2\u0000b80de5d138758541c5f05265ad144ab9fa86d1db",
        "file1\u0000b80de5d138758541c5f05265ad144ab9fa86d1db",
        "file2\u0000b80de5d138758541c5f05265ad144ab9fa86d1db",
        "file1\u00000000000000000000000000000000000000000000d"
    );
    assertEquals(lines, expected);
  }

  @Test
  public void testHgRootSubdir()
    throws VersionControlCommandFailedException, InterruptedException, IOException {
    // Use a subdir of the repository
    HgCmdLineInterface hgCmdLineInterface = (HgCmdLineInterface) makeCmdLine(
        reposPath.resolve(REPO_WITH_SUB_DIR + "/subdir"));
    Path result = hgCmdLineInterface.getHgRoot();
    // Use toRealPath to follow the pecularities of the OS X tempdir system, which uses a
    // /var -> /private/var symlink.
    assertEquals(result, reposPath.resolve(REPO_WITH_SUB_DIR).toRealPath());
  }

  @Test
  public void testHgRootOutsideRepo()
      throws VersionControlCommandFailedException, InterruptedException {
    // Note: reposPath is not a hg repository, so we have to create a HgCmdLineInterface directly
    // here.
    HgCmdLineInterface hgCmdLineInterface = new HgCmdLineInterface(
        new TestProcessExecutorFactory(),
        reposPath,
        new VersionControlBuckConfig(FakeBuckConfig.builder().build()).getHgCmd(),
        ImmutableMap.of()
    );
    Path result = hgCmdLineInterface.getHgRoot();
    assertNull(result);
  }

    return explodeReposZip(tempFolder.getRoot().toPath());
  }

  private static Path explodeReposZip(Path destination) throws IOException {
    Path hgRepoZipCopyPath = destination.resolve(HG_REPOS_ZIP);
    Path reposPath = destination.resolve(REPOS_DIR);
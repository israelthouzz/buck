/*
 * Copyright 2015-present Facebook, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may
 * not use this file except in compliance with the License. You may obtain
 * a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */
package com.facebook.buck.rules.coercer;

import com.facebook.buck.io.ProjectFilesystem;
import com.facebook.buck.rules.CellPathResolver;
import com.facebook.buck.util.ObjectMappers;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import java.nio.file.Path;
import java.util.Map;

/**
 * {@link TypeCoercer} that takes a dict object generated by the manifest_entries() python function
 * and coverts it to {@link ManifestEntries}. This class takes care of parsing each dict entry,
 * making sure it conforms to the specification in {@link ManifestEntries}.
 */
public class ManifestEntriesTypeCoercer extends LeafTypeCoercer<ManifestEntries> {

  private final ObjectMapper objectMapper =
      ObjectMappers.legacyCreate()
          .setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE)
          .enable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);

  @Override
  public Class<ManifestEntries> getOutputClass() {
    return ManifestEntries.class;
  }

  @Override
  public ManifestEntries coerce(
      CellPathResolver cellRoots,
      ProjectFilesystem filesystem,
      Path pathRelativeToProjectRoot,
      Object object)
      throws CoerceFailedException {
    if (!(object instanceof Map)) {
      throw CoerceFailedException.simple(object, getOutputClass());
    }

    @SuppressWarnings("unchecked")
    Map<String, Object> value = (Map<String, Object>) object;
    try {
      return objectMapper.convertValue(value, ManifestEntries.class);
    } catch (IllegalArgumentException e) {
      throw CoerceFailedException.simple(object, getOutputClass(), e.getLocalizedMessage());
    }
  }
}

/**
 * Autogenerated by Thrift Compiler (0.9.3)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.facebook.buck.parser.thrift;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import org.apache.thrift.async.AsyncMethodCallback;
import org.apache.thrift.server.AbstractNonblockingServer.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import javax.annotation.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked"})
@Generated(value = "Autogenerated by Thrift Compiler (0.9.3)", date = "2017-06-20")
public class RemoteDaemonicParserState implements org.apache.thrift.TBase<RemoteDaemonicParserState, RemoteDaemonicParserState._Fields>, java.io.Serializable, Cloneable, Comparable<RemoteDaemonicParserState> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("RemoteDaemonicParserState");

  private static final org.apache.thrift.protocol.TField CACHED_INCLUDES_FIELD_DESC = new org.apache.thrift.protocol.TField("cachedIncludes", org.apache.thrift.protocol.TType.MAP, (short)1);
  private static final org.apache.thrift.protocol.TField CELL_PATH_TO_DAEMONIC_STATE_FIELD_DESC = new org.apache.thrift.protocol.TField("cellPathToDaemonicState", org.apache.thrift.protocol.TType.MAP, (short)2);
  private static final org.apache.thrift.protocol.TField CELL_PATHS_TO_NAMES_FIELD_DESC = new org.apache.thrift.protocol.TField("cellPathsToNames", org.apache.thrift.protocol.TType.MAP, (short)3);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new RemoteDaemonicParserStateStandardSchemeFactory());
    schemes.put(TupleScheme.class, new RemoteDaemonicParserStateTupleSchemeFactory());
  }

  public Map<String,List<String>> cachedIncludes; // optional
  public Map<String,RemoteDaemonicCellState> cellPathToDaemonicState; // optional
  public Map<String,String> cellPathsToNames; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    CACHED_INCLUDES((short)1, "cachedIncludes"),
    CELL_PATH_TO_DAEMONIC_STATE((short)2, "cellPathToDaemonicState"),
    CELL_PATHS_TO_NAMES((short)3, "cellPathsToNames");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // CACHED_INCLUDES
          return CACHED_INCLUDES;
        case 2: // CELL_PATH_TO_DAEMONIC_STATE
          return CELL_PATH_TO_DAEMONIC_STATE;
        case 3: // CELL_PATHS_TO_NAMES
          return CELL_PATHS_TO_NAMES;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final _Fields optionals[] = {_Fields.CACHED_INCLUDES,_Fields.CELL_PATH_TO_DAEMONIC_STATE,_Fields.CELL_PATHS_TO_NAMES};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.CACHED_INCLUDES, new org.apache.thrift.meta_data.FieldMetaData("cachedIncludes", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.MapMetaData(org.apache.thrift.protocol.TType.MAP, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING), 
            new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
                new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)))));
    tmpMap.put(_Fields.CELL_PATH_TO_DAEMONIC_STATE, new org.apache.thrift.meta_data.FieldMetaData("cellPathToDaemonicState", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.MapMetaData(org.apache.thrift.protocol.TType.MAP, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING), 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRUCT            , "RemoteDaemonicCellState"))));
    tmpMap.put(_Fields.CELL_PATHS_TO_NAMES, new org.apache.thrift.meta_data.FieldMetaData("cellPathsToNames", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.MapMetaData(org.apache.thrift.protocol.TType.MAP, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING), 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(RemoteDaemonicParserState.class, metaDataMap);
  }

  public RemoteDaemonicParserState() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public RemoteDaemonicParserState(RemoteDaemonicParserState other) {
    if (other.isSetCachedIncludes()) {
      Map<String,List<String>> __this__cachedIncludes = new HashMap<String,List<String>>(other.cachedIncludes.size());
      for (Map.Entry<String, List<String>> other_element : other.cachedIncludes.entrySet()) {

        String other_element_key = other_element.getKey();
        List<String> other_element_value = other_element.getValue();

        String __this__cachedIncludes_copy_key = other_element_key;

        List<String> __this__cachedIncludes_copy_value = new ArrayList<String>(other_element_value);

        __this__cachedIncludes.put(__this__cachedIncludes_copy_key, __this__cachedIncludes_copy_value);
      }
      this.cachedIncludes = __this__cachedIncludes;
    }
    if (other.isSetCellPathToDaemonicState()) {
      Map<String,RemoteDaemonicCellState> __this__cellPathToDaemonicState = new HashMap<String,RemoteDaemonicCellState>(other.cellPathToDaemonicState.size());
      for (Map.Entry<String, RemoteDaemonicCellState> other_element : other.cellPathToDaemonicState.entrySet()) {

        String other_element_key = other_element.getKey();
        RemoteDaemonicCellState other_element_value = other_element.getValue();

        String __this__cellPathToDaemonicState_copy_key = other_element_key;

        RemoteDaemonicCellState __this__cellPathToDaemonicState_copy_value = other_element_value;

        __this__cellPathToDaemonicState.put(__this__cellPathToDaemonicState_copy_key, __this__cellPathToDaemonicState_copy_value);
      }
      this.cellPathToDaemonicState = __this__cellPathToDaemonicState;
    }
    if (other.isSetCellPathsToNames()) {
      Map<String,String> __this__cellPathsToNames = new HashMap<String,String>(other.cellPathsToNames);
      this.cellPathsToNames = __this__cellPathsToNames;
    }
  }

  public RemoteDaemonicParserState deepCopy() {
    return new RemoteDaemonicParserState(this);
  }

  @Override
  public void clear() {
    this.cachedIncludes = null;
    this.cellPathToDaemonicState = null;
    this.cellPathsToNames = null;
  }

  public int getCachedIncludesSize() {
    return (this.cachedIncludes == null) ? 0 : this.cachedIncludes.size();
  }

  public void putToCachedIncludes(String key, List<String> val) {
    if (this.cachedIncludes == null) {
      this.cachedIncludes = new HashMap<String,List<String>>();
    }
    this.cachedIncludes.put(key, val);
  }

  public Map<String,List<String>> getCachedIncludes() {
    return this.cachedIncludes;
  }

  public RemoteDaemonicParserState setCachedIncludes(Map<String,List<String>> cachedIncludes) {
    this.cachedIncludes = cachedIncludes;
    return this;
  }

  public void unsetCachedIncludes() {
    this.cachedIncludes = null;
  }

  /** Returns true if field cachedIncludes is set (has been assigned a value) and false otherwise */
  public boolean isSetCachedIncludes() {
    return this.cachedIncludes != null;
  }

  public void setCachedIncludesIsSet(boolean value) {
    if (!value) {
      this.cachedIncludes = null;
    }
  }

  public int getCellPathToDaemonicStateSize() {
    return (this.cellPathToDaemonicState == null) ? 0 : this.cellPathToDaemonicState.size();
  }

  public void putToCellPathToDaemonicState(String key, RemoteDaemonicCellState val) {
    if (this.cellPathToDaemonicState == null) {
      this.cellPathToDaemonicState = new HashMap<String,RemoteDaemonicCellState>();
    }
    this.cellPathToDaemonicState.put(key, val);
  }

  public Map<String,RemoteDaemonicCellState> getCellPathToDaemonicState() {
    return this.cellPathToDaemonicState;
  }

  public RemoteDaemonicParserState setCellPathToDaemonicState(Map<String,RemoteDaemonicCellState> cellPathToDaemonicState) {
    this.cellPathToDaemonicState = cellPathToDaemonicState;
    return this;
  }

  public void unsetCellPathToDaemonicState() {
    this.cellPathToDaemonicState = null;
  }

  /** Returns true if field cellPathToDaemonicState is set (has been assigned a value) and false otherwise */
  public boolean isSetCellPathToDaemonicState() {
    return this.cellPathToDaemonicState != null;
  }

  public void setCellPathToDaemonicStateIsSet(boolean value) {
    if (!value) {
      this.cellPathToDaemonicState = null;
    }
  }

  public int getCellPathsToNamesSize() {
    return (this.cellPathsToNames == null) ? 0 : this.cellPathsToNames.size();
  }

  public void putToCellPathsToNames(String key, String val) {
    if (this.cellPathsToNames == null) {
      this.cellPathsToNames = new HashMap<String,String>();
    }
    this.cellPathsToNames.put(key, val);
  }

  public Map<String,String> getCellPathsToNames() {
    return this.cellPathsToNames;
  }

  public RemoteDaemonicParserState setCellPathsToNames(Map<String,String> cellPathsToNames) {
    this.cellPathsToNames = cellPathsToNames;
    return this;
  }

  public void unsetCellPathsToNames() {
    this.cellPathsToNames = null;
  }

  /** Returns true if field cellPathsToNames is set (has been assigned a value) and false otherwise */
  public boolean isSetCellPathsToNames() {
    return this.cellPathsToNames != null;
  }

  public void setCellPathsToNamesIsSet(boolean value) {
    if (!value) {
      this.cellPathsToNames = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case CACHED_INCLUDES:
      if (value == null) {
        unsetCachedIncludes();
      } else {
        setCachedIncludes((Map<String,List<String>>)value);
      }
      break;

    case CELL_PATH_TO_DAEMONIC_STATE:
      if (value == null) {
        unsetCellPathToDaemonicState();
      } else {
        setCellPathToDaemonicState((Map<String,RemoteDaemonicCellState>)value);
      }
      break;

    case CELL_PATHS_TO_NAMES:
      if (value == null) {
        unsetCellPathsToNames();
      } else {
        setCellPathsToNames((Map<String,String>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case CACHED_INCLUDES:
      return getCachedIncludes();

    case CELL_PATH_TO_DAEMONIC_STATE:
      return getCellPathToDaemonicState();

    case CELL_PATHS_TO_NAMES:
      return getCellPathsToNames();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case CACHED_INCLUDES:
      return isSetCachedIncludes();
    case CELL_PATH_TO_DAEMONIC_STATE:
      return isSetCellPathToDaemonicState();
    case CELL_PATHS_TO_NAMES:
      return isSetCellPathsToNames();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof RemoteDaemonicParserState)
      return this.equals((RemoteDaemonicParserState)that);
    return false;
  }

  public boolean equals(RemoteDaemonicParserState that) {
    if (that == null)
      return false;

    boolean this_present_cachedIncludes = true && this.isSetCachedIncludes();
    boolean that_present_cachedIncludes = true && that.isSetCachedIncludes();
    if (this_present_cachedIncludes || that_present_cachedIncludes) {
      if (!(this_present_cachedIncludes && that_present_cachedIncludes))
        return false;
      if (!this.cachedIncludes.equals(that.cachedIncludes))
        return false;
    }

    boolean this_present_cellPathToDaemonicState = true && this.isSetCellPathToDaemonicState();
    boolean that_present_cellPathToDaemonicState = true && that.isSetCellPathToDaemonicState();
    if (this_present_cellPathToDaemonicState || that_present_cellPathToDaemonicState) {
      if (!(this_present_cellPathToDaemonicState && that_present_cellPathToDaemonicState))
        return false;
      if (!this.cellPathToDaemonicState.equals(that.cellPathToDaemonicState))
        return false;
    }

    boolean this_present_cellPathsToNames = true && this.isSetCellPathsToNames();
    boolean that_present_cellPathsToNames = true && that.isSetCellPathsToNames();
    if (this_present_cellPathsToNames || that_present_cellPathsToNames) {
      if (!(this_present_cellPathsToNames && that_present_cellPathsToNames))
        return false;
      if (!this.cellPathsToNames.equals(that.cellPathsToNames))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_cachedIncludes = true && (isSetCachedIncludes());
    list.add(present_cachedIncludes);
    if (present_cachedIncludes)
      list.add(cachedIncludes);

    boolean present_cellPathToDaemonicState = true && (isSetCellPathToDaemonicState());
    list.add(present_cellPathToDaemonicState);
    if (present_cellPathToDaemonicState)
      list.add(cellPathToDaemonicState);

    boolean present_cellPathsToNames = true && (isSetCellPathsToNames());
    list.add(present_cellPathsToNames);
    if (present_cellPathsToNames)
      list.add(cellPathsToNames);

    return list.hashCode();
  }

  @Override
  public int compareTo(RemoteDaemonicParserState other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetCachedIncludes()).compareTo(other.isSetCachedIncludes());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCachedIncludes()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.cachedIncludes, other.cachedIncludes);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetCellPathToDaemonicState()).compareTo(other.isSetCellPathToDaemonicState());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCellPathToDaemonicState()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.cellPathToDaemonicState, other.cellPathToDaemonicState);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetCellPathsToNames()).compareTo(other.isSetCellPathsToNames());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCellPathsToNames()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.cellPathsToNames, other.cellPathsToNames);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("RemoteDaemonicParserState(");
    boolean first = true;

    if (isSetCachedIncludes()) {
      sb.append("cachedIncludes:");
      if (this.cachedIncludes == null) {
        sb.append("null");
      } else {
        sb.append(this.cachedIncludes);
      }
      first = false;
    }
    if (isSetCellPathToDaemonicState()) {
      if (!first) sb.append(", ");
      sb.append("cellPathToDaemonicState:");
      if (this.cellPathToDaemonicState == null) {
        sb.append("null");
      } else {
        sb.append(this.cellPathToDaemonicState);
      }
      first = false;
    }
    if (isSetCellPathsToNames()) {
      if (!first) sb.append(", ");
      sb.append("cellPathsToNames:");
      if (this.cellPathsToNames == null) {
        sb.append("null");
      } else {
        sb.append(this.cellPathsToNames);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class RemoteDaemonicParserStateStandardSchemeFactory implements SchemeFactory {
    public RemoteDaemonicParserStateStandardScheme getScheme() {
      return new RemoteDaemonicParserStateStandardScheme();
    }
  }

  private static class RemoteDaemonicParserStateStandardScheme extends StandardScheme<RemoteDaemonicParserState> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, RemoteDaemonicParserState struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // CACHED_INCLUDES
            if (schemeField.type == org.apache.thrift.protocol.TType.MAP) {
              {
                org.apache.thrift.protocol.TMap _map0 = iprot.readMapBegin();
                struct.cachedIncludes = new HashMap<String,List<String>>(2*_map0.size);
                String _key1;
                List<String> _val2;
                for (int _i3 = 0; _i3 < _map0.size; ++_i3)
                {
                  _key1 = iprot.readString();
                  {
                    org.apache.thrift.protocol.TList _list4 = iprot.readListBegin();
                    _val2 = new ArrayList<String>(_list4.size);
                    String _elem5;
                    for (int _i6 = 0; _i6 < _list4.size; ++_i6)
                    {
                      _elem5 = iprot.readString();
                      _val2.add(_elem5);
                    }
                    iprot.readListEnd();
                  }
                  struct.cachedIncludes.put(_key1, _val2);
                }
                iprot.readMapEnd();
              }
              struct.setCachedIncludesIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // CELL_PATH_TO_DAEMONIC_STATE
            if (schemeField.type == org.apache.thrift.protocol.TType.MAP) {
              {
                org.apache.thrift.protocol.TMap _map7 = iprot.readMapBegin();
                struct.cellPathToDaemonicState = new HashMap<String,RemoteDaemonicCellState>(2*_map7.size);
                String _key8;
                RemoteDaemonicCellState _val9;
                for (int _i10 = 0; _i10 < _map7.size; ++_i10)
                {
                  _key8 = iprot.readString();
                  _val9 = new RemoteDaemonicCellState();
                  _val9.read(iprot);
                  struct.cellPathToDaemonicState.put(_key8, _val9);
                }
                iprot.readMapEnd();
              }
              struct.setCellPathToDaemonicStateIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // CELL_PATHS_TO_NAMES
            if (schemeField.type == org.apache.thrift.protocol.TType.MAP) {
              {
                org.apache.thrift.protocol.TMap _map11 = iprot.readMapBegin();
                struct.cellPathsToNames = new HashMap<String,String>(2*_map11.size);
                String _key12;
                String _val13;
                for (int _i14 = 0; _i14 < _map11.size; ++_i14)
                {
                  _key12 = iprot.readString();
                  _val13 = iprot.readString();
                  struct.cellPathsToNames.put(_key12, _val13);
                }
                iprot.readMapEnd();
              }
              struct.setCellPathsToNamesIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, RemoteDaemonicParserState struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.cachedIncludes != null) {
        if (struct.isSetCachedIncludes()) {
          oprot.writeFieldBegin(CACHED_INCLUDES_FIELD_DESC);
          {
            oprot.writeMapBegin(new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.STRING, org.apache.thrift.protocol.TType.LIST, struct.cachedIncludes.size()));
            for (Map.Entry<String, List<String>> _iter15 : struct.cachedIncludes.entrySet())
            {
              oprot.writeString(_iter15.getKey());
              {
                oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, _iter15.getValue().size()));
                for (String _iter16 : _iter15.getValue())
                {
                  oprot.writeString(_iter16);
                }
                oprot.writeListEnd();
              }
            }
            oprot.writeMapEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      if (struct.cellPathToDaemonicState != null) {
        if (struct.isSetCellPathToDaemonicState()) {
          oprot.writeFieldBegin(CELL_PATH_TO_DAEMONIC_STATE_FIELD_DESC);
          {
            oprot.writeMapBegin(new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.STRING, org.apache.thrift.protocol.TType.STRUCT, struct.cellPathToDaemonicState.size()));
            for (Map.Entry<String, RemoteDaemonicCellState> _iter17 : struct.cellPathToDaemonicState.entrySet())
            {
              oprot.writeString(_iter17.getKey());
              _iter17.getValue().write(oprot);
            }
            oprot.writeMapEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      if (struct.cellPathsToNames != null) {
        if (struct.isSetCellPathsToNames()) {
          oprot.writeFieldBegin(CELL_PATHS_TO_NAMES_FIELD_DESC);
          {
            oprot.writeMapBegin(new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.STRING, org.apache.thrift.protocol.TType.STRING, struct.cellPathsToNames.size()));
            for (Map.Entry<String, String> _iter18 : struct.cellPathsToNames.entrySet())
            {
              oprot.writeString(_iter18.getKey());
              oprot.writeString(_iter18.getValue());
            }
            oprot.writeMapEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class RemoteDaemonicParserStateTupleSchemeFactory implements SchemeFactory {
    public RemoteDaemonicParserStateTupleScheme getScheme() {
      return new RemoteDaemonicParserStateTupleScheme();
    }
  }

  private static class RemoteDaemonicParserStateTupleScheme extends TupleScheme<RemoteDaemonicParserState> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, RemoteDaemonicParserState struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetCachedIncludes()) {
        optionals.set(0);
      }
      if (struct.isSetCellPathToDaemonicState()) {
        optionals.set(1);
      }
      if (struct.isSetCellPathsToNames()) {
        optionals.set(2);
      }
      oprot.writeBitSet(optionals, 3);
      if (struct.isSetCachedIncludes()) {
        {
          oprot.writeI32(struct.cachedIncludes.size());
          for (Map.Entry<String, List<String>> _iter19 : struct.cachedIncludes.entrySet())
          {
            oprot.writeString(_iter19.getKey());
            {
              oprot.writeI32(_iter19.getValue().size());
              for (String _iter20 : _iter19.getValue())
              {
                oprot.writeString(_iter20);
              }
            }
          }
        }
      }
      if (struct.isSetCellPathToDaemonicState()) {
        {
          oprot.writeI32(struct.cellPathToDaemonicState.size());
          for (Map.Entry<String, RemoteDaemonicCellState> _iter21 : struct.cellPathToDaemonicState.entrySet())
          {
            oprot.writeString(_iter21.getKey());
            _iter21.getValue().write(oprot);
          }
        }
      }
      if (struct.isSetCellPathsToNames()) {
        {
          oprot.writeI32(struct.cellPathsToNames.size());
          for (Map.Entry<String, String> _iter22 : struct.cellPathsToNames.entrySet())
          {
            oprot.writeString(_iter22.getKey());
            oprot.writeString(_iter22.getValue());
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, RemoteDaemonicParserState struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(3);
      if (incoming.get(0)) {
        {
          org.apache.thrift.protocol.TMap _map23 = new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.STRING, org.apache.thrift.protocol.TType.LIST, iprot.readI32());
          struct.cachedIncludes = new HashMap<String,List<String>>(2*_map23.size);
          String _key24;
          List<String> _val25;
          for (int _i26 = 0; _i26 < _map23.size; ++_i26)
          {
            _key24 = iprot.readString();
            {
              org.apache.thrift.protocol.TList _list27 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, iprot.readI32());
              _val25 = new ArrayList<String>(_list27.size);
              String _elem28;
              for (int _i29 = 0; _i29 < _list27.size; ++_i29)
              {
                _elem28 = iprot.readString();
                _val25.add(_elem28);
              }
            }
            struct.cachedIncludes.put(_key24, _val25);
          }
        }
        struct.setCachedIncludesIsSet(true);
      }
      if (incoming.get(1)) {
        {
          org.apache.thrift.protocol.TMap _map30 = new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.STRING, org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
          struct.cellPathToDaemonicState = new HashMap<String,RemoteDaemonicCellState>(2*_map30.size);
          String _key31;
          RemoteDaemonicCellState _val32;
          for (int _i33 = 0; _i33 < _map30.size; ++_i33)
          {
            _key31 = iprot.readString();
            _val32 = new RemoteDaemonicCellState();
            _val32.read(iprot);
            struct.cellPathToDaemonicState.put(_key31, _val32);
          }
        }
        struct.setCellPathToDaemonicStateIsSet(true);
      }
      if (incoming.get(2)) {
        {
          org.apache.thrift.protocol.TMap _map34 = new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.STRING, org.apache.thrift.protocol.TType.STRING, iprot.readI32());
          struct.cellPathsToNames = new HashMap<String,String>(2*_map34.size);
          String _key35;
          String _val36;
          for (int _i37 = 0; _i37 < _map34.size; ++_i37)
          {
            _key35 = iprot.readString();
            _val36 = iprot.readString();
            struct.cellPathsToNames.put(_key35, _val36);
          }
        }
        struct.setCellPathsToNamesIsSet(true);
      }
    }
  }

}

/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.HashSet;
import java.util.Collections;
import java.util.BitSet;
import java.util.Arrays;
import com.facebook.thrift.*;
import com.facebook.thrift.annotations.*;
import com.facebook.thrift.async.*;
import com.facebook.thrift.meta_data.*;
import com.facebook.thrift.server.*;
import com.facebook.thrift.transport.*;
import com.facebook.thrift.protocol.*;

@SuppressWarnings({ "unused", "serial" })
public class StructLevelTerseStruct implements TBase, java.io.Serializable, Cloneable {
  private static final TStruct STRUCT_DESC = new TStruct("StructLevelTerseStruct");
  private static final TField BOOL_FIELD_FIELD_DESC = new TField("bool_field", TType.BOOL, (short)1);
  private static final TField BYTE_FIELD_FIELD_DESC = new TField("byte_field", TType.BYTE, (short)2);
  private static final TField SHORT_FIELD_FIELD_DESC = new TField("short_field", TType.I16, (short)3);
  private static final TField INT_FIELD_FIELD_DESC = new TField("int_field", TType.I32, (short)4);
  private static final TField LONG_FIELD_FIELD_DESC = new TField("long_field", TType.I64, (short)5);
  private static final TField FLOAT_FIELD_FIELD_DESC = new TField("float_field", TType.FLOAT, (short)6);
  private static final TField DOUBLE_FIELD_FIELD_DESC = new TField("double_field", TType.DOUBLE, (short)7);
  private static final TField STRING_FIELD_FIELD_DESC = new TField("string_field", TType.STRING, (short)8);
  private static final TField BINARY_FIELD_FIELD_DESC = new TField("binary_field", TType.STRING, (short)9);
  private static final TField ENUM_FIELD_FIELD_DESC = new TField("enum_field", TType.I32, (short)10);
  private static final TField LIST_FIELD_FIELD_DESC = new TField("list_field", TType.LIST, (short)11);
  private static final TField SET_FIELD_FIELD_DESC = new TField("set_field", TType.SET, (short)12);
  private static final TField MAP_FIELD_FIELD_DESC = new TField("map_field", TType.MAP, (short)13);
  private static final TField STRUCT_FIELD_FIELD_DESC = new TField("struct_field", TType.STRUCT, (short)14);

  public final Boolean bool_field;
  public final Byte byte_field;
  public final Short short_field;
  public final Integer int_field;
  public final Long long_field;
  public final Float float_field;
  public final Double double_field;
  public final String string_field;
  public final byte[] binary_field;
  /**
   * 
   * @see MyEnum
   */
  public final MyEnum enum_field;
  public final List<Short> list_field;
  public final Set<Short> set_field;
  public final Map<Short,Short> map_field;
  public final MyStruct struct_field;
  public static final int BOOL_FIELD = 1;
  public static final int BYTE_FIELD = 2;
  public static final int SHORT_FIELD = 3;
  public static final int INT_FIELD = 4;
  public static final int LONG_FIELD = 5;
  public static final int FLOAT_FIELD = 6;
  public static final int DOUBLE_FIELD = 7;
  public static final int STRING_FIELD = 8;
  public static final int BINARY_FIELD = 9;
  public static final int ENUM_FIELD = 10;
  public static final int LIST_FIELD = 11;
  public static final int SET_FIELD = 12;
  public static final int MAP_FIELD = 13;
  public static final int STRUCT_FIELD = 14;

  public StructLevelTerseStruct(
      Boolean bool_field,
      Byte byte_field,
      Short short_field,
      Integer int_field,
      Long long_field,
      Float float_field,
      Double double_field,
      String string_field,
      byte[] binary_field,
      MyEnum enum_field,
      List<Short> list_field,
      Set<Short> set_field,
      Map<Short,Short> map_field,
      MyStruct struct_field) {
    this.bool_field = bool_field;
    this.byte_field = byte_field;
    this.short_field = short_field;
    this.int_field = int_field;
    this.long_field = long_field;
    this.float_field = float_field;
    this.double_field = double_field;
    this.string_field = string_field;
    this.binary_field = binary_field;
    this.enum_field = enum_field;
    this.list_field = list_field;
    this.set_field = set_field;
    this.map_field = map_field;
    this.struct_field = struct_field;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public StructLevelTerseStruct(StructLevelTerseStruct other) {
    if (other.isSetBool_field()) {
      this.bool_field = TBaseHelper.deepCopy(other.bool_field);
    } else {
      this.bool_field = null;
    }
    if (other.isSetByte_field()) {
      this.byte_field = TBaseHelper.deepCopy(other.byte_field);
    } else {
      this.byte_field = null;
    }
    if (other.isSetShort_field()) {
      this.short_field = TBaseHelper.deepCopy(other.short_field);
    } else {
      this.short_field = null;
    }
    if (other.isSetInt_field()) {
      this.int_field = TBaseHelper.deepCopy(other.int_field);
    } else {
      this.int_field = null;
    }
    if (other.isSetLong_field()) {
      this.long_field = TBaseHelper.deepCopy(other.long_field);
    } else {
      this.long_field = null;
    }
    if (other.isSetFloat_field()) {
      this.float_field = TBaseHelper.deepCopy(other.float_field);
    } else {
      this.float_field = null;
    }
    if (other.isSetDouble_field()) {
      this.double_field = TBaseHelper.deepCopy(other.double_field);
    } else {
      this.double_field = null;
    }
    if (other.isSetString_field()) {
      this.string_field = TBaseHelper.deepCopy(other.string_field);
    } else {
      this.string_field = null;
    }
    if (other.isSetBinary_field()) {
      this.binary_field = TBaseHelper.deepCopy(other.binary_field);
    } else {
      this.binary_field = null;
    }
    if (other.isSetEnum_field()) {
      this.enum_field = TBaseHelper.deepCopy(other.enum_field);
    } else {
      this.enum_field = null;
    }
    if (other.isSetList_field()) {
      this.list_field = TBaseHelper.deepCopy(other.list_field);
    } else {
      this.list_field = null;
    }
    if (other.isSetSet_field()) {
      this.set_field = TBaseHelper.deepCopy(other.set_field);
    } else {
      this.set_field = null;
    }
    if (other.isSetMap_field()) {
      this.map_field = TBaseHelper.deepCopy(other.map_field);
    } else {
      this.map_field = null;
    }
    if (other.isSetStruct_field()) {
      this.struct_field = TBaseHelper.deepCopy(other.struct_field);
    } else {
      this.struct_field = null;
    }
  }

  public StructLevelTerseStruct deepCopy() {
    return new StructLevelTerseStruct(this);
  }

  public Boolean isBool_field() {
    return this.bool_field;
  }

  // Returns true if field bool_field is set (has been assigned a value) and false otherwise
  public boolean isSetBool_field() {
    return this.bool_field != null;
  }

  public Byte getByte_field() {
    return this.byte_field;
  }

  // Returns true if field byte_field is set (has been assigned a value) and false otherwise
  public boolean isSetByte_field() {
    return this.byte_field != null;
  }

  public Short getShort_field() {
    return this.short_field;
  }

  // Returns true if field short_field is set (has been assigned a value) and false otherwise
  public boolean isSetShort_field() {
    return this.short_field != null;
  }

  public Integer getInt_field() {
    return this.int_field;
  }

  // Returns true if field int_field is set (has been assigned a value) and false otherwise
  public boolean isSetInt_field() {
    return this.int_field != null;
  }

  public Long getLong_field() {
    return this.long_field;
  }

  // Returns true if field long_field is set (has been assigned a value) and false otherwise
  public boolean isSetLong_field() {
    return this.long_field != null;
  }

  public Float getFloat_field() {
    return this.float_field;
  }

  // Returns true if field float_field is set (has been assigned a value) and false otherwise
  public boolean isSetFloat_field() {
    return this.float_field != null;
  }

  public Double getDouble_field() {
    return this.double_field;
  }

  // Returns true if field double_field is set (has been assigned a value) and false otherwise
  public boolean isSetDouble_field() {
    return this.double_field != null;
  }

  public String getString_field() {
    return this.string_field;
  }

  // Returns true if field string_field is set (has been assigned a value) and false otherwise
  public boolean isSetString_field() {
    return this.string_field != null;
  }

  public byte[] getBinary_field() {
    return this.binary_field;
  }

  // Returns true if field binary_field is set (has been assigned a value) and false otherwise
  public boolean isSetBinary_field() {
    return this.binary_field != null;
  }

  /**
   * 
   * @see MyEnum
   */
  public MyEnum getEnum_field() {
    return this.enum_field;
  }

  // Returns true if field enum_field is set (has been assigned a value) and false otherwise
  public boolean isSetEnum_field() {
    return this.enum_field != null;
  }

  public List<Short> getList_field() {
    return this.list_field;
  }

  // Returns true if field list_field is set (has been assigned a value) and false otherwise
  public boolean isSetList_field() {
    return this.list_field != null;
  }

  public Set<Short> getSet_field() {
    return this.set_field;
  }

  // Returns true if field set_field is set (has been assigned a value) and false otherwise
  public boolean isSetSet_field() {
    return this.set_field != null;
  }

  public Map<Short,Short> getMap_field() {
    return this.map_field;
  }

  // Returns true if field map_field is set (has been assigned a value) and false otherwise
  public boolean isSetMap_field() {
    return this.map_field != null;
  }

  public MyStruct getStruct_field() {
    return this.struct_field;
  }

  // Returns true if field struct_field is set (has been assigned a value) and false otherwise
  public boolean isSetStruct_field() {
    return this.struct_field != null;
  }

  @Override
  public boolean equals(Object _that) {
    if (_that == null)
      return false;
    if (this == _that)
      return true;
    if (!(_that instanceof StructLevelTerseStruct))
      return false;
    StructLevelTerseStruct that = (StructLevelTerseStruct)_that;

    if (!TBaseHelper.equalsNobinary(this.isSetBool_field(), that.isSetBool_field(), this.bool_field, that.bool_field)) { return false; }

    if (!TBaseHelper.equalsNobinary(this.isSetByte_field(), that.isSetByte_field(), this.byte_field, that.byte_field)) { return false; }

    if (!TBaseHelper.equalsNobinary(this.isSetShort_field(), that.isSetShort_field(), this.short_field, that.short_field)) { return false; }

    if (!TBaseHelper.equalsNobinary(this.isSetInt_field(), that.isSetInt_field(), this.int_field, that.int_field)) { return false; }

    if (!TBaseHelper.equalsNobinary(this.isSetLong_field(), that.isSetLong_field(), this.long_field, that.long_field)) { return false; }

    if (!TBaseHelper.equalsNobinary(this.isSetFloat_field(), that.isSetFloat_field(), this.float_field, that.float_field)) { return false; }

    if (!TBaseHelper.equalsNobinary(this.isSetDouble_field(), that.isSetDouble_field(), this.double_field, that.double_field)) { return false; }

    if (!TBaseHelper.equalsNobinary(this.isSetString_field(), that.isSetString_field(), this.string_field, that.string_field)) { return false; }

    if (!TBaseHelper.equalsSlow(this.isSetBinary_field(), that.isSetBinary_field(), this.binary_field, that.binary_field)) { return false; }

    if (!TBaseHelper.equalsNobinary(this.isSetEnum_field(), that.isSetEnum_field(), this.enum_field, that.enum_field)) { return false; }

    if (!TBaseHelper.equalsNobinary(this.isSetList_field(), that.isSetList_field(), this.list_field, that.list_field)) { return false; }

    if (!TBaseHelper.equalsNobinary(this.isSetSet_field(), that.isSetSet_field(), this.set_field, that.set_field)) { return false; }

    if (!TBaseHelper.equalsNobinary(this.isSetMap_field(), that.isSetMap_field(), this.map_field, that.map_field)) { return false; }

    if (!TBaseHelper.equalsNobinary(this.isSetStruct_field(), that.isSetStruct_field(), this.struct_field, that.struct_field)) { return false; }

    return true;
  }

  @Override
  public int hashCode() {
    return Arrays.deepHashCode(new Object[] {bool_field, byte_field, short_field, int_field, long_field, float_field, double_field, string_field, binary_field, enum_field, list_field, set_field, map_field, struct_field});
  }

  // This is required to satisfy the TBase interface, but can't be implemented on immutable struture.
  public void read(TProtocol iprot) throws TException {
    throw new TException("unimplemented in android immutable structure");
  }

  public static StructLevelTerseStruct deserialize(TProtocol iprot) throws TException {
    Boolean tmp_bool_field = null;
    Byte tmp_byte_field = null;
    Short tmp_short_field = null;
    Integer tmp_int_field = null;
    Long tmp_long_field = null;
    Float tmp_float_field = null;
    Double tmp_double_field = null;
    String tmp_string_field = null;
    byte[] tmp_binary_field = null;
    MyEnum tmp_enum_field = null;
    List<Short> tmp_list_field = null;
    Set<Short> tmp_set_field = null;
    Map<Short,Short> tmp_map_field = null;
    MyStruct tmp_struct_field = null;
    TField __field;
    iprot.readStructBegin();
    while (true)
    {
      __field = iprot.readFieldBegin();
      if (__field.type == TType.STOP) {
        break;
      }
      switch (__field.id)
      {
        case BOOL_FIELD:
          if (__field.type == TType.BOOL) {
            tmp_bool_field = iprot.readBool();
          } else {
            TProtocolUtil.skip(iprot, __field.type);
          }
          break;
        case BYTE_FIELD:
          if (__field.type == TType.BYTE) {
            tmp_byte_field = iprot.readByte();
          } else {
            TProtocolUtil.skip(iprot, __field.type);
          }
          break;
        case SHORT_FIELD:
          if (__field.type == TType.I16) {
            tmp_short_field = iprot.readI16();
          } else {
            TProtocolUtil.skip(iprot, __field.type);
          }
          break;
        case INT_FIELD:
          if (__field.type == TType.I32) {
            tmp_int_field = iprot.readI32();
          } else {
            TProtocolUtil.skip(iprot, __field.type);
          }
          break;
        case LONG_FIELD:
          if (__field.type == TType.I64) {
            tmp_long_field = iprot.readI64();
          } else {
            TProtocolUtil.skip(iprot, __field.type);
          }
          break;
        case FLOAT_FIELD:
          if (__field.type == TType.FLOAT) {
            tmp_float_field = iprot.readFloat();
          } else {
            TProtocolUtil.skip(iprot, __field.type);
          }
          break;
        case DOUBLE_FIELD:
          if (__field.type == TType.DOUBLE) {
            tmp_double_field = iprot.readDouble();
          } else {
            TProtocolUtil.skip(iprot, __field.type);
          }
          break;
        case STRING_FIELD:
          if (__field.type == TType.STRING) {
            tmp_string_field = iprot.readString();
          } else {
            TProtocolUtil.skip(iprot, __field.type);
          }
          break;
        case BINARY_FIELD:
          if (__field.type == TType.STRING) {
            tmp_binary_field = iprot.readBinary();
          } else {
            TProtocolUtil.skip(iprot, __field.type);
          }
          break;
        case ENUM_FIELD:
          if (__field.type == TType.I32) {
            tmp_enum_field = MyEnum.findByValue(iprot.readI32());
          } else {
            TProtocolUtil.skip(iprot, __field.type);
          }
          break;
        case LIST_FIELD:
          if (__field.type == TType.LIST) {
            {
              TList _list0 = iprot.readListBegin();
              tmp_list_field = new ArrayList<Short>(Math.max(0, _list0.size));
              for (int _i1 = 0; 
                   (_list0.size < 0) ? iprot.peekList() : (_i1 < _list0.size); 
                   ++_i1)
              {
                Short _elem2;
                _elem2 = iprot.readI16();
                tmp_list_field.add(_elem2);
              }
              iprot.readListEnd();
            }
          } else {
            TProtocolUtil.skip(iprot, __field.type);
          }
          break;
        case SET_FIELD:
          if (__field.type == TType.SET) {
            {
              TSet _set3 = iprot.readSetBegin();
              tmp_set_field = new HashSet<Short>(Math.max(0, 2*_set3.size));
              for (int _i4 = 0; 
                   (_set3.size < 0) ? iprot.peekSet() : (_i4 < _set3.size); 
                   ++_i4)
              {
                Short _elem5;
                _elem5 = iprot.readI16();
                tmp_set_field.add(_elem5);
              }
              iprot.readSetEnd();
            }
          } else {
            TProtocolUtil.skip(iprot, __field.type);
          }
          break;
        case MAP_FIELD:
          if (__field.type == TType.MAP) {
            {
              TMap _map6 = iprot.readMapBegin();
              tmp_map_field = new HashMap<Short,Short>(Math.max(0, 2*_map6.size));
              for (int _i7 = 0; 
                   (_map6.size < 0) ? iprot.peekMap() : (_i7 < _map6.size); 
                   ++_i7)
              {
                Short _key8;
                Short _val9;
                _key8 = iprot.readI16();
                _val9 = iprot.readI16();
                tmp_map_field.put(_key8, _val9);
              }
              iprot.readMapEnd();
            }
          } else {
            TProtocolUtil.skip(iprot, __field.type);
          }
          break;
        case STRUCT_FIELD:
          if (__field.type == TType.STRUCT) {
            tmp_struct_field = MyStruct.deserialize(iprot);
          } else {
            TProtocolUtil.skip(iprot, __field.type);
          }
          break;
        default:
          TProtocolUtil.skip(iprot, __field.type);
          break;
      }
      iprot.readFieldEnd();
    }
    iprot.readStructEnd();

    StructLevelTerseStruct _that;
    _that = new StructLevelTerseStruct(
      tmp_bool_field
      ,tmp_byte_field
      ,tmp_short_field
      ,tmp_int_field
      ,tmp_long_field
      ,tmp_float_field
      ,tmp_double_field
      ,tmp_string_field
      ,tmp_binary_field
      ,tmp_enum_field
      ,tmp_list_field
      ,tmp_set_field
      ,tmp_map_field
      ,tmp_struct_field
    );
    _that.validate();
    return _that;
  }

  public void write(TProtocol oprot) throws TException {
    validate();

    oprot.writeStructBegin(STRUCT_DESC);
    if (this.bool_field != null) {
      oprot.writeFieldBegin(BOOL_FIELD_FIELD_DESC);
      oprot.writeBool(this.bool_field);
      oprot.writeFieldEnd();
    }
    if (this.byte_field != null) {
      oprot.writeFieldBegin(BYTE_FIELD_FIELD_DESC);
      oprot.writeByte(this.byte_field);
      oprot.writeFieldEnd();
    }
    if (this.short_field != null) {
      oprot.writeFieldBegin(SHORT_FIELD_FIELD_DESC);
      oprot.writeI16(this.short_field);
      oprot.writeFieldEnd();
    }
    if (this.int_field != null) {
      oprot.writeFieldBegin(INT_FIELD_FIELD_DESC);
      oprot.writeI32(this.int_field);
      oprot.writeFieldEnd();
    }
    if (this.long_field != null) {
      oprot.writeFieldBegin(LONG_FIELD_FIELD_DESC);
      oprot.writeI64(this.long_field);
      oprot.writeFieldEnd();
    }
    if (this.float_field != null) {
      oprot.writeFieldBegin(FLOAT_FIELD_FIELD_DESC);
      oprot.writeFloat(this.float_field);
      oprot.writeFieldEnd();
    }
    if (this.double_field != null) {
      oprot.writeFieldBegin(DOUBLE_FIELD_FIELD_DESC);
      oprot.writeDouble(this.double_field);
      oprot.writeFieldEnd();
    }
    if (this.string_field != null) {
      oprot.writeFieldBegin(STRING_FIELD_FIELD_DESC);
      oprot.writeString(this.string_field);
      oprot.writeFieldEnd();
    }
    if (this.binary_field != null) {
      oprot.writeFieldBegin(BINARY_FIELD_FIELD_DESC);
      oprot.writeBinary(this.binary_field);
      oprot.writeFieldEnd();
    }
    if (this.enum_field != null) {
      oprot.writeFieldBegin(ENUM_FIELD_FIELD_DESC);
      oprot.writeI32(this.enum_field == null ? 0 : this.enum_field.getValue());
      oprot.writeFieldEnd();
    }
    if (this.list_field != null) {
      oprot.writeFieldBegin(LIST_FIELD_FIELD_DESC);
      {
        oprot.writeListBegin(new TList(TType.I16, this.list_field.size()));
        for (Short _iter10 : this.list_field)        {
          oprot.writeI16(_iter10);
        }
        oprot.writeListEnd();
      }
      oprot.writeFieldEnd();
    }
    if (this.set_field != null) {
      oprot.writeFieldBegin(SET_FIELD_FIELD_DESC);
      {
        oprot.writeSetBegin(new TSet(TType.I16, this.set_field.size()));
        for (Short _iter11 : this.set_field)        {
          oprot.writeI16(_iter11);
        }
        oprot.writeSetEnd();
      }
      oprot.writeFieldEnd();
    }
    if (this.map_field != null) {
      oprot.writeFieldBegin(MAP_FIELD_FIELD_DESC);
      {
        oprot.writeMapBegin(new TMap(TType.I16, TType.I16, this.map_field.size()));
        for (Map.Entry<Short, Short> _iter12 : this.map_field.entrySet())        {
          oprot.writeI16(_iter12.getKey());
          oprot.writeI16(_iter12.getValue());
        }
        oprot.writeMapEnd();
      }
      oprot.writeFieldEnd();
    }
    if (this.struct_field != null) {
      oprot.writeFieldBegin(STRUCT_FIELD_FIELD_DESC);
      this.struct_field.write(oprot);
      oprot.writeFieldEnd();
    }
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  @Override
  public String toString() {
    return toString(1, true);
  }

  @Override
  public String toString(int indent, boolean prettyPrint) {
    return TBaseHelper.toStringHelper(this, indent, prettyPrint);
  }

  public void validate() throws TException {
    // check for required fields
  }

}


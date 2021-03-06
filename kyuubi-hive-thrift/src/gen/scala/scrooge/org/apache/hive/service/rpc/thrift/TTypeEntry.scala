/**
 * Generated by Scrooge
 *   version: 19.12.0
 *   rev: dfdb68cf6b9c501dbbe3ae644504bf403ad76bfa
 *   built at: 20191212-171820
 */
package org.apache.hive.service.rpc.thrift

import com.twitter.scrooge.{
  TFieldBlob,
  ThriftStruct,
  ThriftStructFieldInfo,
  ThriftStructMetaData,
  ThriftUnion,
  ThriftUnionFieldInfo,
  ValidatingThriftStruct,
  ValidatingThriftStructCodec3}
import org.apache.thrift.protocol._
import scala.collection.immutable.{Map => immutable$Map}

@javax.annotation.Generated(value = Array("com.twitter.scrooge.Compiler"))
sealed trait TTypeEntry
  extends ThriftUnion
  with ThriftStruct
  with ValidatingThriftStruct[TTypeEntry] {

  def _codec: ValidatingThriftStructCodec3[TTypeEntry] = TTypeEntry
}

private object TTypeEntryDecoder {
  def apply(_iprot: TProtocol, newUnknown: TFieldBlob => TTypeEntry): TTypeEntry = {
    var _result: TTypeEntry = null
    _iprot.readStructBegin()
    val _field = _iprot.readFieldBegin()
    _field.id match {
      case 1 => // primitiveEntry
        _field.`type` match {
          case TType.STRUCT =>
            _result = TTypeEntry.PrimitiveEntry({
              org.apache.hive.service.rpc.thrift.TPrimitiveTypeEntry.decode(_iprot)
            })
          case _ => TProtocolUtil.skip(_iprot, _field.`type`)
        }
      case 2 => // arrayEntry
        _field.`type` match {
          case TType.STRUCT =>
            _result = TTypeEntry.ArrayEntry({
              org.apache.hive.service.rpc.thrift.TArrayTypeEntry.decode(_iprot)
            })
          case _ => TProtocolUtil.skip(_iprot, _field.`type`)
        }
      case 3 => // mapEntry
        _field.`type` match {
          case TType.STRUCT =>
            _result = TTypeEntry.MapEntry({
              org.apache.hive.service.rpc.thrift.TMapTypeEntry.decode(_iprot)
            })
          case _ => TProtocolUtil.skip(_iprot, _field.`type`)
        }
      case 4 => // structEntry
        _field.`type` match {
          case TType.STRUCT =>
            _result = TTypeEntry.StructEntry({
              org.apache.hive.service.rpc.thrift.TStructTypeEntry.decode(_iprot)
            })
          case _ => TProtocolUtil.skip(_iprot, _field.`type`)
        }
      case 5 => // unionEntry
        _field.`type` match {
          case TType.STRUCT =>
            _result = TTypeEntry.UnionEntry({
              org.apache.hive.service.rpc.thrift.TUnionTypeEntry.decode(_iprot)
            })
          case _ => TProtocolUtil.skip(_iprot, _field.`type`)
        }
      case 6 => // userDefinedTypeEntry
        _field.`type` match {
          case TType.STRUCT =>
            _result = TTypeEntry.UserDefinedTypeEntry({
              org.apache.hive.service.rpc.thrift.TUserDefinedTypeEntry.decode(_iprot)
            })
          case _ => TProtocolUtil.skip(_iprot, _field.`type`)
        }
      case _ =>
        if (_field.`type` != TType.STOP) {
          _result = newUnknown(TFieldBlob.read(_field, _iprot))
        } else {
          TProtocolUtil.skip(_iprot, _field.`type`)
        }
    }
    if (_field.`type` != TType.STOP) {
      _iprot.readFieldEnd()
      var _done = false
      var _moreThanOne = false
      while (!_done) {
        val _field = _iprot.readFieldBegin()
        if (_field.`type` == TType.STOP)
          _done = true
        else {
          _moreThanOne = true
          TProtocolUtil.skip(_iprot, _field.`type`)
          _iprot.readFieldEnd()
        }
      }
      if (_moreThanOne) {
        _iprot.readStructEnd()
        throw new TProtocolException("Cannot read a TUnion with more than one set value!")
      }
    }
    _iprot.readStructEnd()
    if (_result == null)
      throw new TProtocolException("Cannot read a TUnion with no set value!")
    _result
  }
}

object TTypeEntryAliases {

  type PrimitiveEntryAlias = org.apache.hive.service.rpc.thrift.TPrimitiveTypeEntry

  def withoutPassthroughFields_PrimitiveEntry(obj: TTypeEntry.PrimitiveEntry): TTypeEntry.PrimitiveEntry = {
    val field = obj.primitiveEntry
    TTypeEntry.PrimitiveEntry(
      org.apache.hive.service.rpc.thrift.TPrimitiveTypeEntry.withoutPassthroughFields(field)
    )
  }

  val PrimitiveEntryKeyTypeManifest: _root_.scala.Option[Manifest[_]] = _root_.scala.None

  val PrimitiveEntryValueTypeManifest: _root_.scala.Option[Manifest[_]] = _root_.scala.None

  type ArrayEntryAlias = org.apache.hive.service.rpc.thrift.TArrayTypeEntry

  def withoutPassthroughFields_ArrayEntry(obj: TTypeEntry.ArrayEntry): TTypeEntry.ArrayEntry = {
    val field = obj.arrayEntry
    TTypeEntry.ArrayEntry(
      org.apache.hive.service.rpc.thrift.TArrayTypeEntry.withoutPassthroughFields(field)
    )
  }

  val ArrayEntryKeyTypeManifest: _root_.scala.Option[Manifest[_]] = _root_.scala.None

  val ArrayEntryValueTypeManifest: _root_.scala.Option[Manifest[_]] = _root_.scala.None

  type MapEntryAlias = org.apache.hive.service.rpc.thrift.TMapTypeEntry

  def withoutPassthroughFields_MapEntry(obj: TTypeEntry.MapEntry): TTypeEntry.MapEntry = {
    val field = obj.mapEntry
    TTypeEntry.MapEntry(
      org.apache.hive.service.rpc.thrift.TMapTypeEntry.withoutPassthroughFields(field)
    )
  }

  val MapEntryKeyTypeManifest: _root_.scala.Option[Manifest[_]] = _root_.scala.None

  val MapEntryValueTypeManifest: _root_.scala.Option[Manifest[_]] = _root_.scala.None

  type StructEntryAlias = org.apache.hive.service.rpc.thrift.TStructTypeEntry

  def withoutPassthroughFields_StructEntry(obj: TTypeEntry.StructEntry): TTypeEntry.StructEntry = {
    val field = obj.structEntry
    TTypeEntry.StructEntry(
      org.apache.hive.service.rpc.thrift.TStructTypeEntry.withoutPassthroughFields(field)
    )
  }

  val StructEntryKeyTypeManifest: _root_.scala.Option[Manifest[_]] = _root_.scala.None

  val StructEntryValueTypeManifest: _root_.scala.Option[Manifest[_]] = _root_.scala.None

  type UnionEntryAlias = org.apache.hive.service.rpc.thrift.TUnionTypeEntry

  def withoutPassthroughFields_UnionEntry(obj: TTypeEntry.UnionEntry): TTypeEntry.UnionEntry = {
    val field = obj.unionEntry
    TTypeEntry.UnionEntry(
      org.apache.hive.service.rpc.thrift.TUnionTypeEntry.withoutPassthroughFields(field)
    )
  }

  val UnionEntryKeyTypeManifest: _root_.scala.Option[Manifest[_]] = _root_.scala.None

  val UnionEntryValueTypeManifest: _root_.scala.Option[Manifest[_]] = _root_.scala.None

  type UserDefinedTypeEntryAlias = org.apache.hive.service.rpc.thrift.TUserDefinedTypeEntry

  def withoutPassthroughFields_UserDefinedTypeEntry(obj: TTypeEntry.UserDefinedTypeEntry): TTypeEntry.UserDefinedTypeEntry = {
    val field = obj.userDefinedTypeEntry
    TTypeEntry.UserDefinedTypeEntry(
      org.apache.hive.service.rpc.thrift.TUserDefinedTypeEntry.withoutPassthroughFields(field)
    )
  }

  val UserDefinedTypeEntryKeyTypeManifest: _root_.scala.Option[Manifest[_]] = _root_.scala.None

  val UserDefinedTypeEntryValueTypeManifest: _root_.scala.Option[Manifest[_]] = _root_.scala.None
}


@javax.annotation.Generated(value = Array("com.twitter.scrooge.Compiler"))
object TTypeEntry extends ValidatingThriftStructCodec3[TTypeEntry] {
  val Union: TStruct = new TStruct("TTypeEntry")
  val PrimitiveEntryField: TField = new TField("primitiveEntry", TType.STRUCT, 1)
  val PrimitiveEntryFieldManifest: Manifest[PrimitiveEntry] = implicitly[Manifest[PrimitiveEntry]]
  val ArrayEntryField: TField = new TField("arrayEntry", TType.STRUCT, 2)
  val ArrayEntryFieldManifest: Manifest[ArrayEntry] = implicitly[Manifest[ArrayEntry]]
  val MapEntryField: TField = new TField("mapEntry", TType.STRUCT, 3)
  val MapEntryFieldManifest: Manifest[MapEntry] = implicitly[Manifest[MapEntry]]
  val StructEntryField: TField = new TField("structEntry", TType.STRUCT, 4)
  val StructEntryFieldManifest: Manifest[StructEntry] = implicitly[Manifest[StructEntry]]
  val UnionEntryField: TField = new TField("unionEntry", TType.STRUCT, 5)
  val UnionEntryFieldManifest: Manifest[UnionEntry] = implicitly[Manifest[UnionEntry]]
  val UserDefinedTypeEntryField: TField = new TField("userDefinedTypeEntry", TType.STRUCT, 6)
  val UserDefinedTypeEntryFieldManifest: Manifest[UserDefinedTypeEntry] = implicitly[Manifest[UserDefinedTypeEntry]]

  lazy val structAnnotations: immutable$Map[java.lang.String, java.lang.String] =
    immutable$Map.empty[java.lang.String, java.lang.String]

  /**
   * Field information in declaration order.
   */
  lazy val fieldInfos: scala.List[ThriftUnionFieldInfo[_ <: TTypeEntry, _]] = scala.List(
    new ThriftUnionFieldInfo[PrimitiveEntry, TTypeEntryAliases.PrimitiveEntryAlias](
      PrimitiveEntry.fieldInfo,
      PrimitiveEntry.unapply
    ),
    new ThriftUnionFieldInfo[ArrayEntry, TTypeEntryAliases.ArrayEntryAlias](
      ArrayEntry.fieldInfo,
      ArrayEntry.unapply
    ),
    new ThriftUnionFieldInfo[MapEntry, TTypeEntryAliases.MapEntryAlias](
      MapEntry.fieldInfo,
      MapEntry.unapply
    ),
    new ThriftUnionFieldInfo[StructEntry, TTypeEntryAliases.StructEntryAlias](
      StructEntry.fieldInfo,
      StructEntry.unapply
    ),
    new ThriftUnionFieldInfo[UnionEntry, TTypeEntryAliases.UnionEntryAlias](
      UnionEntry.fieldInfo,
      UnionEntry.unapply
    ),
    new ThriftUnionFieldInfo[UserDefinedTypeEntry, TTypeEntryAliases.UserDefinedTypeEntryAlias](
      UserDefinedTypeEntry.fieldInfo,
      UserDefinedTypeEntry.unapply
    )
  )

  override lazy val metaData = new ThriftStructMetaData(
    this,
    Seq(),
    Seq(),
    fieldInfos.asInstanceOf[Seq[ThriftUnionFieldInfo[_root_.com.twitter.scrooge.ThriftUnion with _root_.com.twitter.scrooge.ThriftStruct, _]]],
    structAnnotations)

  override def encode(_item: TTypeEntry, _oprot: TProtocol): Unit =
    _item.write(_oprot)

  override def decode(_iprot: TProtocol): TTypeEntry =
    TTypeEntryDecoder(_iprot, UnknownUnionField(_))

  def apply(_iprot: TProtocol): TTypeEntry = decode(_iprot)

  import TTypeEntryAliases._

  def withoutPassthroughFields(struct: TTypeEntry): TTypeEntry = {
    struct match {
      case obj: PrimitiveEntry => withoutPassthroughFields_PrimitiveEntry(obj)
      case obj: ArrayEntry => withoutPassthroughFields_ArrayEntry(obj)
      case obj: MapEntry => withoutPassthroughFields_MapEntry(obj)
      case obj: StructEntry => withoutPassthroughFields_StructEntry(obj)
      case obj: UnionEntry => withoutPassthroughFields_UnionEntry(obj)
      case obj: UserDefinedTypeEntry => withoutPassthroughFields_UserDefinedTypeEntry(obj)
      case unknown: UnknownUnionField => unknown // by definition pass-through
    }
  }

  object PrimitiveEntry extends (PrimitiveEntryAlias => PrimitiveEntry) {
    def withoutPassthroughFields(obj: PrimitiveEntry): PrimitiveEntry =
      withoutPassthroughFields_PrimitiveEntry(obj)

    val fieldInfo: ThriftStructFieldInfo =
      new ThriftStructFieldInfo(
        PrimitiveEntryField,
        false,
        false,
        manifest[PrimitiveEntryAlias],
        PrimitiveEntryKeyTypeManifest,
        PrimitiveEntryValueTypeManifest,
        immutable$Map.empty[java.lang.String, java.lang.String],
        immutable$Map.empty[java.lang.String, java.lang.String]
      )
  }

  case class PrimitiveEntry(
      primitiveEntry: PrimitiveEntryAlias)
    extends TTypeEntry {

    protected type ContainedType = PrimitiveEntryAlias

    def containedValue(): ContainedType = primitiveEntry

    def unionStructFieldInfo: _root_.scala.Option[ThriftStructFieldInfo] =
      _root_.scala.Some(PrimitiveEntry.fieldInfo)

    override def write(_oprot: TProtocol): Unit = {
      if (primitiveEntry == null)
        throw new TProtocolException("Cannot write a TUnion with no set value!")
      _oprot.writeStructBegin(Union)
      if (primitiveEntry ne null) {
        val primitiveEntry_item = primitiveEntry
        _oprot.writeFieldBegin(PrimitiveEntryField)
        primitiveEntry_item.write(_oprot)
        _oprot.writeFieldEnd()
      }
      _oprot.writeFieldStop()
      _oprot.writeStructEnd()
    }
  }

  object ArrayEntry extends (ArrayEntryAlias => ArrayEntry) {
    def withoutPassthroughFields(obj: ArrayEntry): ArrayEntry =
      withoutPassthroughFields_ArrayEntry(obj)

    val fieldInfo: ThriftStructFieldInfo =
      new ThriftStructFieldInfo(
        ArrayEntryField,
        false,
        false,
        manifest[ArrayEntryAlias],
        ArrayEntryKeyTypeManifest,
        ArrayEntryValueTypeManifest,
        immutable$Map.empty[java.lang.String, java.lang.String],
        immutable$Map.empty[java.lang.String, java.lang.String]
      )
  }

  case class ArrayEntry(
      arrayEntry: ArrayEntryAlias)
    extends TTypeEntry {

    protected type ContainedType = ArrayEntryAlias

    def containedValue(): ContainedType = arrayEntry

    def unionStructFieldInfo: _root_.scala.Option[ThriftStructFieldInfo] =
      _root_.scala.Some(ArrayEntry.fieldInfo)

    override def write(_oprot: TProtocol): Unit = {
      if (arrayEntry == null)
        throw new TProtocolException("Cannot write a TUnion with no set value!")
      _oprot.writeStructBegin(Union)
      if (arrayEntry ne null) {
        val arrayEntry_item = arrayEntry
        _oprot.writeFieldBegin(ArrayEntryField)
        arrayEntry_item.write(_oprot)
        _oprot.writeFieldEnd()
      }
      _oprot.writeFieldStop()
      _oprot.writeStructEnd()
    }
  }

  object MapEntry extends (MapEntryAlias => MapEntry) {
    def withoutPassthroughFields(obj: MapEntry): MapEntry =
      withoutPassthroughFields_MapEntry(obj)

    val fieldInfo: ThriftStructFieldInfo =
      new ThriftStructFieldInfo(
        MapEntryField,
        false,
        false,
        manifest[MapEntryAlias],
        MapEntryKeyTypeManifest,
        MapEntryValueTypeManifest,
        immutable$Map.empty[java.lang.String, java.lang.String],
        immutable$Map.empty[java.lang.String, java.lang.String]
      )
  }

  case class MapEntry(
      mapEntry: MapEntryAlias)
    extends TTypeEntry {

    protected type ContainedType = MapEntryAlias

    def containedValue(): ContainedType = mapEntry

    def unionStructFieldInfo: _root_.scala.Option[ThriftStructFieldInfo] =
      _root_.scala.Some(MapEntry.fieldInfo)

    override def write(_oprot: TProtocol): Unit = {
      if (mapEntry == null)
        throw new TProtocolException("Cannot write a TUnion with no set value!")
      _oprot.writeStructBegin(Union)
      if (mapEntry ne null) {
        val mapEntry_item = mapEntry
        _oprot.writeFieldBegin(MapEntryField)
        mapEntry_item.write(_oprot)
        _oprot.writeFieldEnd()
      }
      _oprot.writeFieldStop()
      _oprot.writeStructEnd()
    }
  }

  object StructEntry extends (StructEntryAlias => StructEntry) {
    def withoutPassthroughFields(obj: StructEntry): StructEntry =
      withoutPassthroughFields_StructEntry(obj)

    val fieldInfo: ThriftStructFieldInfo =
      new ThriftStructFieldInfo(
        StructEntryField,
        false,
        false,
        manifest[StructEntryAlias],
        StructEntryKeyTypeManifest,
        StructEntryValueTypeManifest,
        immutable$Map.empty[java.lang.String, java.lang.String],
        immutable$Map.empty[java.lang.String, java.lang.String]
      )
  }

  case class StructEntry(
      structEntry: StructEntryAlias)
    extends TTypeEntry {

    protected type ContainedType = StructEntryAlias

    def containedValue(): ContainedType = structEntry

    def unionStructFieldInfo: _root_.scala.Option[ThriftStructFieldInfo] =
      _root_.scala.Some(StructEntry.fieldInfo)

    override def write(_oprot: TProtocol): Unit = {
      if (structEntry == null)
        throw new TProtocolException("Cannot write a TUnion with no set value!")
      _oprot.writeStructBegin(Union)
      if (structEntry ne null) {
        val structEntry_item = structEntry
        _oprot.writeFieldBegin(StructEntryField)
        structEntry_item.write(_oprot)
        _oprot.writeFieldEnd()
      }
      _oprot.writeFieldStop()
      _oprot.writeStructEnd()
    }
  }

  object UnionEntry extends (UnionEntryAlias => UnionEntry) {
    def withoutPassthroughFields(obj: UnionEntry): UnionEntry =
      withoutPassthroughFields_UnionEntry(obj)

    val fieldInfo: ThriftStructFieldInfo =
      new ThriftStructFieldInfo(
        UnionEntryField,
        false,
        false,
        manifest[UnionEntryAlias],
        UnionEntryKeyTypeManifest,
        UnionEntryValueTypeManifest,
        immutable$Map.empty[java.lang.String, java.lang.String],
        immutable$Map.empty[java.lang.String, java.lang.String]
      )
  }

  case class UnionEntry(
      unionEntry: UnionEntryAlias)
    extends TTypeEntry {

    protected type ContainedType = UnionEntryAlias

    def containedValue(): ContainedType = unionEntry

    def unionStructFieldInfo: _root_.scala.Option[ThriftStructFieldInfo] =
      _root_.scala.Some(UnionEntry.fieldInfo)

    override def write(_oprot: TProtocol): Unit = {
      if (unionEntry == null)
        throw new TProtocolException("Cannot write a TUnion with no set value!")
      _oprot.writeStructBegin(Union)
      if (unionEntry ne null) {
        val unionEntry_item = unionEntry
        _oprot.writeFieldBegin(UnionEntryField)
        unionEntry_item.write(_oprot)
        _oprot.writeFieldEnd()
      }
      _oprot.writeFieldStop()
      _oprot.writeStructEnd()
    }
  }

  object UserDefinedTypeEntry extends (UserDefinedTypeEntryAlias => UserDefinedTypeEntry) {
    def withoutPassthroughFields(obj: UserDefinedTypeEntry): UserDefinedTypeEntry =
      withoutPassthroughFields_UserDefinedTypeEntry(obj)

    val fieldInfo: ThriftStructFieldInfo =
      new ThriftStructFieldInfo(
        UserDefinedTypeEntryField,
        false,
        false,
        manifest[UserDefinedTypeEntryAlias],
        UserDefinedTypeEntryKeyTypeManifest,
        UserDefinedTypeEntryValueTypeManifest,
        immutable$Map.empty[java.lang.String, java.lang.String],
        immutable$Map.empty[java.lang.String, java.lang.String]
      )
  }

  case class UserDefinedTypeEntry(
      userDefinedTypeEntry: UserDefinedTypeEntryAlias)
    extends TTypeEntry {

    protected type ContainedType = UserDefinedTypeEntryAlias

    def containedValue(): ContainedType = userDefinedTypeEntry

    def unionStructFieldInfo: _root_.scala.Option[ThriftStructFieldInfo] =
      _root_.scala.Some(UserDefinedTypeEntry.fieldInfo)

    override def write(_oprot: TProtocol): Unit = {
      if (userDefinedTypeEntry == null)
        throw new TProtocolException("Cannot write a TUnion with no set value!")
      _oprot.writeStructBegin(Union)
      if (userDefinedTypeEntry ne null) {
        val userDefinedTypeEntry_item = userDefinedTypeEntry
        _oprot.writeFieldBegin(UserDefinedTypeEntryField)
        userDefinedTypeEntry_item.write(_oprot)
        _oprot.writeFieldEnd()
      }
      _oprot.writeFieldStop()
      _oprot.writeStructEnd()
    }
  }

  case class UnknownUnionField private[TTypeEntry](
      field: TFieldBlob)
    extends TTypeEntry {

    protected type ContainedType = Unit

    def containedValue(): ContainedType = ()

    def unionStructFieldInfo: _root_.scala.Option[ThriftStructFieldInfo] = _root_.scala.None

    override def write(_oprot: TProtocol): Unit = {
      _oprot.writeStructBegin(Union)
      field.write(_oprot)
      _oprot.writeFieldStop()
      _oprot.writeStructEnd()
    }
  }

 /**
  * Checks that the struct is a valid as a new instance. If there are any missing required or
  * construction required fields, return a non-empty list.
  */
  override def validateNewInstance(
    item: TTypeEntry
  ): scala.Seq[com.twitter.scrooge.validation.Issue] = {
    validateField(item.containedValue())
  }
}
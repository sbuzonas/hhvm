/**
 * Autogenerated by Thrift for thrift/compiler/test/fixtures/encode/src/module.thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated @nocommit
 */

#include "thrift/compiler/test/fixtures/encode/gen-cpp2/module_data.h"

#include <thrift/lib/cpp2/gen/module_data_cpp.h>

#if defined(__GNUC__) && defined(__linux__) && !FOLLY_MOBILE
// This attribute is applied to the static data members to ensure that they are
// not stripped from the compiled binary, in order to keep them available for
// use by debuggers at runtime.
//
// The attribute works by forcing all of the data members (both used and unused
// ones) into the same section. This stops the linker from stripping the unused
// data, as it works on a per-section basis and only removes sections if they
// are entirely unused.
#define THRIFT_DATA_SECTION [[gnu::section(".rodata.thrift.data")]]
#else
#define THRIFT_DATA_SECTION
#endif

namespace apache {
namespace thrift {

THRIFT_DATA_SECTION const std::array<::facebook::thrift::test::Enum, 2> TEnumDataStorage<::facebook::thrift::test::Enum>::values = {{
  type::first,
  type::second,
}};
THRIFT_DATA_SECTION const std::array<folly::StringPiece, 2> TEnumDataStorage<::facebook::thrift::test::Enum>::names = {{
  "first",
  "second",
}};

THRIFT_DATA_SECTION const std::array<folly::StringPiece, 1> TStructDataStorage<::facebook::thrift::test::Foo>::fields_names = {{
  "field",
}};
THRIFT_DATA_SECTION const std::array<int16_t, 1> TStructDataStorage<::facebook::thrift::test::Foo>::fields_ids = {{
  1,
}};
THRIFT_DATA_SECTION const std::array<protocol::TType, 1> TStructDataStorage<::facebook::thrift::test::Foo>::fields_types = {{
  TType::T_I32,
}};
THRIFT_DATA_SECTION const std::array<folly::StringPiece, 1> TStructDataStorage<::facebook::thrift::test::Foo>::storage_names = {{
  "__fbthrift_field_field",
}};
THRIFT_DATA_SECTION const std::array<int, 1> TStructDataStorage<::facebook::thrift::test::Foo>::isset_indexes = {{
  0,
}};

THRIFT_DATA_SECTION const std::array<folly::StringPiece, 1> TStructDataStorage<::facebook::thrift::test::Bar>::fields_names = {{
  "list_field",
}};
THRIFT_DATA_SECTION const std::array<int16_t, 1> TStructDataStorage<::facebook::thrift::test::Bar>::fields_ids = {{
  1,
}};
THRIFT_DATA_SECTION const std::array<protocol::TType, 1> TStructDataStorage<::facebook::thrift::test::Bar>::fields_types = {{
  TType::T_LIST,
}};
THRIFT_DATA_SECTION const std::array<folly::StringPiece, 1> TStructDataStorage<::facebook::thrift::test::Bar>::storage_names = {{
  "__fbthrift_field_list_field",
}};
THRIFT_DATA_SECTION const std::array<int, 1> TStructDataStorage<::facebook::thrift::test::Bar>::isset_indexes = {{
  0,
}};

THRIFT_DATA_SECTION const std::array<folly::StringPiece, 12> TStructDataStorage<::facebook::thrift::test::OpEncodeStruct>::fields_names = {{
  "int_field",
  "enum_field",
  "foo_field",
  "adapted_field",
  "list_field",
  "list_shared_ptr_field",
  "list_cpp_type_field",
  "set_field",
  "map_field",
  "nested_field",
  "bar_field",
  "adapted_list_field",
}};
THRIFT_DATA_SECTION const std::array<int16_t, 12> TStructDataStorage<::facebook::thrift::test::OpEncodeStruct>::fields_ids = {{
  1,
  2,
  3,
  4,
  5,
  6,
  7,
  8,
  9,
  10,
  11,
  12,
}};
THRIFT_DATA_SECTION const std::array<protocol::TType, 12> TStructDataStorage<::facebook::thrift::test::OpEncodeStruct>::fields_types = {{
  TType::T_I32,
  TType::T_I32,
  TType::T_STRUCT,
  TType::T_STRUCT,
  TType::T_LIST,
  TType::T_LIST,
  TType::T_LIST,
  TType::T_SET,
  TType::T_MAP,
  TType::T_MAP,
  TType::T_STRUCT,
  TType::T_LIST,
}};
THRIFT_DATA_SECTION const std::array<folly::StringPiece, 12> TStructDataStorage<::facebook::thrift::test::OpEncodeStruct>::storage_names = {{
  "__fbthrift_field_int_field",
  "__fbthrift_field_enum_field",
  "__fbthrift_field_foo_field",
  "__fbthrift_field_adapted_field",
  "__fbthrift_field_list_field",
  "__fbthrift_field_list_shared_ptr_field",
  "__fbthrift_field_list_cpp_type_field",
  "__fbthrift_field_set_field",
  "__fbthrift_field_map_field",
  "__fbthrift_field_nested_field",
  "__fbthrift_field_bar_field",
  "__fbthrift_field_adapted_list_field",
}};
THRIFT_DATA_SECTION const std::array<int, 12> TStructDataStorage<::facebook::thrift::test::OpEncodeStruct>::isset_indexes = {{
  0,
  1,
  2,
  3,
  4,
  -1,
  5,
  6,
  7,
  8,
  9,
  10,
}};

} // namespace thrift
} // namespace apache

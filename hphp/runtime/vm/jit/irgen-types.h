/*
   +----------------------------------------------------------------------+
   | HipHop for PHP                                                       |
   +----------------------------------------------------------------------+
   | Copyright (c) 2010-present Facebook, Inc. (http://www.facebook.com)  |
   +----------------------------------------------------------------------+
   | This source file is subject to version 3.01 of the PHP license,      |
   | that is bundled with this package in the file LICENSE, and is        |
   | available through the world-wide-web at the following url:           |
   | http://www.php.net/license/3_01.txt                                  |
   | If you did not receive a copy of the PHP license and are unable to   |
   | obtain it through the world-wide-web, please send a note to          |
   | license@php.net so we can mail you a copy immediately.               |
   +----------------------------------------------------------------------+
*/
#pragma once

#include "hphp/runtime/vm/containers.h"
#include "hphp/runtime/vm/jit/stack-offsets.h"
#include "hphp/runtime/vm/jit/types.h"

namespace HPHP {

struct MysteryBoxConstraint;
struct RepoAuthType;
struct StringData;
struct TypeConstraint;
struct Func;

namespace jit {

struct Block;
struct SSATmp;
struct Type;

namespace irgen {

struct IRGS;

//////////////////////////////////////////////////////////////////////

void verifyParamType(IRGS& env, const Func* callee, int32_t id,
                     BCSPRelOffset offset, SSATmp* prologueCtx);

void verifyPropType(IRGS& env,
                    SSATmp* cls,
                    const HPHP::TypeConstraint* tc,
                    const VMCompactVector<TypeConstraint>* ubs,
                    Slot slot,
                    SSATmp* val,
                    SSATmp* name,
                    bool isSProp,
                    SSATmp** coerce = nullptr);

void verifyMysteryBoxConstraint(IRGS& env, const MysteryBoxConstraint& c,
                                SSATmp* val, Block* fail);

void raiseClsmethCompatTypeHint(
  IRGS& env, int32_t id, const Func* func, const TypeConstraint& tc);

//////////////////////////////////////////////////////////////////////

SSATmp* implInstanceOfD(IRGS& env, SSATmp* src, const StringData* className);

//////////////////////////////////////////////////////////////////////

}}}

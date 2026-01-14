#!/usr/bin/env bash
set -euo pipefail

echo "=== OpenJML Static Checking (ESC) ==="

SRC=src/main/java
JMLRUNTIME=/home/renato/tools/openjml/jmlruntime.jar

# MODEL
openjml -esc \
  -classpath "$JMLRUNTIME" \
  -sourcepath "$SRC" \
  $SRC/ita/kangaroo/model/*.java

# DAO
openjml -esc \
  -classpath "$JMLRUNTIME" \
  -sourcepath "$SRC" \
  $SRC/ita/kangaroo/dao/*.java

echo "=== ESC completed successfully ==="

echo "=== OpenJML Runtime Assertion Checking (RAC) ==="
mkdir -p bin

openjml -rac -d bin \
  -classpath "$JMLRUNTIME" \
  -sourcepath "$SRC" \
  $SRC/ita/kangaroo/model/*.java \
  $SRC/ita/kangaroo/dao/*.java \
  2>&1 | tee rac.log

echo "=== RAC completed ==="

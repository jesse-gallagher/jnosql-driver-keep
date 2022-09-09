#!/usr/bin/env bash

set -e

cd "$(dirname "${BASH_SOURCE[0]}")"

rm -rf out

openapi-generator generate -g java -i openapi.core.json -o out -c config.yaml --skip-validate-spec

rm -rf ../jnosql-driver-keep/src/main/java/org/openntf/xsp/nosql/communication/driver/keep/client || true

cp -r out/src/main/java/org/openntf/xsp/nosql/communication/driver/keep/client ../jnosql-driver-keep/src/main/java/org/openntf/xsp/nosql/communication/driver/keep/
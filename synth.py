# Copyright 2021 Google LLC
#
# Licensed under the Apache License, Version 2.0 (the "License");
# you may not use this file except in compliance with the License.
# You may obtain a copy of the License at
#
#     http://www.apache.org/licenses/LICENSE-2.0
#
# Unless required by applicable law or agreed to in writing, software
# distributed under the License is distributed on an "AS IS" BASIS,
# WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
# See the License for the specific language governing permissions and
# limitations under the License.

"""This script is used to synthesize generated parts of this library."""

import synthtool.languages.java as java

service = 'metastore'
versions = ['v1alpha', 'v1beta', 'v1']

for version in versions:
  java.pregenerated_library(
    service=service,
    version=version,
    path=f'google/cloud/metastore/{version}',
    destination_name='dataproc-metastore',
  )

java.common_templates()
/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.gluten.utils

import org.apache.gluten.vectorized.JniLibLoader

class SharedLibraryLoaderAlmaLinux9 extends SharedLibraryLoader {
  override def loadLib(loader: JniLibLoader): Unit = {
    loader
      .newTransaction()
      .loadAndCreateLink("liblz4.so.1", "liblz4.so", false)
      .loadAndCreateLink("libz.so.1", "libz.so", false)
      .loadAndCreateLink("libzstd.so.1", "libzstd.so", false)
      .loadAndCreateLink("libstdc++.so.6", "libstdc++.so", false)
      .loadAndCreateLink("libm.so.6", "libm.so", false)
      .loadAndCreateLink("libgcc_s.so.1", "libgcc_s.so", false)
      .loadAndCreateLink("libc.so.6", "libc.so", false)
      .loadAndCreateLink("ld-linux-x86-64.so.2", "ld-linux-x86-64.so", false)
      .loadAndCreateLink("libgflags.so.2.2", "libgflags.so", false)
      .loadAndCreateLink("libglog.so.1", "libglog.so", false)
      .loadAndCreateLink("libre2.so.9", "libre2.so", false)
      .loadAndCreateLink("libboost_context.so.1.84.0", "libboost_context.so", false)
      .loadAndCreateLink("libboost_filesystem.so.1.84.0", "libboost_filesystem.so", false)
      .loadAndCreateLink("libboost_program_options.so.1.84.0", "libboost_program_options.so", false)
      .loadAndCreateLink("libboost_regex.so.1.84.0", "libboost_regex.so", false)
      .loadAndCreateLink("libboost_system.so.1.84.0", "libboost_system.so", false)
      .loadAndCreateLink("libboost_thread.so.1.84.0", "libboost_thread.so", false)
      .loadAndCreateLink("libdouble-conversion.so.3", "libdouble-conversion.so", false)
      .loadAndCreateLink("libevent-2.1.so.7", "libevent-2.1.so", false)
      .loadAndCreateLink("libssl.so.3", "libssl.so", false)
      .loadAndCreateLink("libcrypto.so.3", "libcrypto.so", false)
      .loadAndCreateLink("liblzma.so.5", "liblzma.so", false)
      .loadAndCreateLink("libsodium.so.23", "libsodium.so", false)
      .loadAndCreateLink("libprotobuf.so.32", "libprotobuf.so", false)
      .loadAndCreateLink("libxml2.so.2", "libxml2.so", false)
      .loadAndCreateLink("libicudata.so.67", "libicudata.so", false)
      .loadAndCreateLink("libicui18n.so.67", "libicui18n.so", false)
      .loadAndCreateLink("libicuuc.so.67", "libicuuc.so", false)
      .loadAndCreateLink("libidn.so.12", "libidn.so", false)
      .loadAndCreateLink("libntlm.so.0", "libntlm.so", false)
      .loadAndCreateLink("libgssapi_krb5.so.2", "libgssapi_krb5.so", false)
      .loadAndCreateLink("libkrb5.so.3", "libkrb5.so", false)
      .loadAndCreateLink("libk5crypto.so.3", "libk5crypto.so", false)
      .loadAndCreateLink("libcom_err.so.2", "libcom_err.so", false)
      .loadAndCreateLink("libkrb5support.so.0", "libkrb5support.so", false)
      .loadAndCreateLink("libkeyutils.so.1", "libkeyutils.so", false)
      .loadAndCreateLink("libresolv.so.2", "libresolv.so", false)
      .loadAndCreateLink("libselinux.so.1", "libselinux.so", false)
      .loadAndCreateLink("libpcre2-8.so.0", "libpcre2-8.so", false)
      .loadAndCreateLink("libgsasl.so.7", "libgsasl.so", false)
      .loadAndCreateLink("libhdfs3.so.1", "libhdfs3.so", false)
      .commit()
  }
}

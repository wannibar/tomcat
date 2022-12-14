/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

// Generated by jextract

package org.apache.tomcat.util.openssl;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$4 {

    static final FunctionDescriptor BN_get_rfc3526_prime_6144$FUNC = FunctionDescriptor.of(C_POINTER,
        C_POINTER
    );
    static final MethodHandle BN_get_rfc3526_prime_6144$MH = RuntimeHelper.downcallHandle(
        openssl_h.LIBRARIES, "BN_get_rfc3526_prime_6144",
        "(Ljdk/incubator/foreign/MemoryAddress;)Ljdk/incubator/foreign/MemoryAddress;",
        constants$4.BN_get_rfc3526_prime_6144$FUNC, false
    );
    static final FunctionDescriptor BN_get_rfc3526_prime_8192$FUNC = FunctionDescriptor.of(C_POINTER,
        C_POINTER
    );
    static final MethodHandle BN_get_rfc3526_prime_8192$MH = RuntimeHelper.downcallHandle(
        openssl_h.LIBRARIES, "BN_get_rfc3526_prime_8192",
        "(Ljdk/incubator/foreign/MemoryAddress;)Ljdk/incubator/foreign/MemoryAddress;",
        constants$4.BN_get_rfc3526_prime_8192$FUNC, false
    );
    static final FunctionDescriptor ASN1_STRING_length$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER
    );
    static final MethodHandle ASN1_STRING_length$MH = RuntimeHelper.downcallHandle(
        openssl_h.LIBRARIES, "ASN1_STRING_length",
        "(Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$4.ASN1_STRING_length$FUNC, false
    );
    static final FunctionDescriptor ASN1_STRING_get0_data$FUNC = FunctionDescriptor.of(C_POINTER,
        C_POINTER
    );
    static final MethodHandle ASN1_STRING_get0_data$MH = RuntimeHelper.downcallHandle(
        openssl_h.LIBRARIES, "ASN1_STRING_get0_data",
        "(Ljdk/incubator/foreign/MemoryAddress;)Ljdk/incubator/foreign/MemoryAddress;",
        constants$4.ASN1_STRING_get0_data$FUNC, false
    );
    static final FunctionDescriptor EVP_MD_get0_provider$FUNC = FunctionDescriptor.of(C_POINTER,
        C_POINTER
    );
    static final MethodHandle EVP_MD_get0_provider$MH = RuntimeHelper.downcallHandle(
        openssl_h.LIBRARIES, "EVP_MD_get0_provider",
        "(Ljdk/incubator/foreign/MemoryAddress;)Ljdk/incubator/foreign/MemoryAddress;",
        constants$4.EVP_MD_get0_provider$FUNC, false
    );
    static final FunctionDescriptor EVP_MD_fetch$FUNC = FunctionDescriptor.of(C_POINTER,
        C_POINTER,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle EVP_MD_fetch$MH = RuntimeHelper.downcallHandle(
        openssl_h.LIBRARIES, "EVP_MD_fetch",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)Ljdk/incubator/foreign/MemoryAddress;",
        constants$4.EVP_MD_fetch$FUNC, false
    );
}



/*
 * Copyright (C) 2016 Dominik Schürmann <dominik@dominikschuermann.de>
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http//www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.fdroid.fdroid.privileged;

import android.util.Pair;

import java.util.Arrays;
import java.util.HashSet;

/**
 * Only apps signed using a certificate with a SHA-256 hash listed here
 * can access the Privileged Extension!
 * 1. Get SHA-256 of certificate with
 * keytool -list -printcert -jarfile com.example.apk
 * 2. Add here as lowercase without colons
 */
public class ClientWhitelist {

    public static HashSet<Pair<String, String>> whitelist = new HashSet<>(Arrays.asList(
            new Pair<>("org.fdroid.fdroid", "15F4D59FFA07B7C850C05F7F3486C9FAA3583559A75931D6805A276991101476"), //release
            new Pair<>("org.fdroid.fdroid", "6A38B109BEAAB7B794E4339DA02E47A809705D64BEAFEA853D7264ABA74CFEBB") //platform
    ));

}

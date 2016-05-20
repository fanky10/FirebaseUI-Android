/*
 * Copyright 2016 Google Inc. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the
 * License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.firebase.ui.auth.util;

import com.google.firebase.FirebaseApp;

import org.robolectric.annotation.Implementation;
import org.robolectric.annotation.Implements;

@Implements(FirebaseAuthWrapperFactory.class)
public class ShadowFirebaseAuthWrapperFactory {
    public static FirebaseAuthWrapper firebaseAuthWrapper;

    public static void setFirebaseAuthWrapper(FirebaseAuthWrapper instance) {
        firebaseAuthWrapper = instance;
    }

    @Implementation
    public static FirebaseAuthWrapper getFirebaseAuthWrapper(FirebaseApp firebaseApp) {
        return firebaseAuthWrapper;
    }

    @Implementation
    public static FirebaseAuthWrapper getFirebaseAuthWrapper(String appName) {
        return firebaseAuthWrapper;
    }
}

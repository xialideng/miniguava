/*
 * Copyright (C) 2011 The Guava Authors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package net.ypresto.miniguava.collect.immutables;

import static com.google.common.testing.SerializableTester.reserialize;
import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertTrue;

import com.google.common.testing.SerializableTester;

import java.util.Set;

/**
 * Variant of {@link SerializableTester} that does not require the reserialized object's class to be
 * identical to the original.
 *
 * @author Chris Povirk
 */
// miniguava: from collect pacakge.
final class LenientSerializableTester {
  /*
   * TODO(cpovirk): move this to c.g.c.testing if we allow for c.g.c.annotations dependencies so
   * that it can be GWTified?
   */

  static <E> Set<E> reserializeAndAssertLenient(Set<E> original) {
    Set<E> copy = reserialize(original);
    assertEquals(original, copy);
    assertTrue(copy instanceof ImmutableSet);
    return copy;
  }

  // miniguava: Removed reserializeAndAssertLenient(Multiset)

  private LenientSerializableTester() {}
}

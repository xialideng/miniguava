/*
 * Copyright (C) 2008 The Guava Authors
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

package net.ypresto.miniguava.collect;

import java.util.Iterator;

/**
 * An iterator that does not support {@link #remove}.
 *
 * <p>{@code UnmodifiableIterator} is used primarily in conjunction with implementations of
 * {@code ImmutableCollection}, such as {@code ImmutableList}. You can, however, convert an existing
 * iterator to an {@code UnmodifiableIterator} using {@link Iterators#unmodifiableIterator}.
 *
 * @author Jared Levy
 * @since 2.0
 */
public abstract class UnmodifiableIterator<E> implements Iterator<E> {
  /** Constructor for use by subclasses. */
  protected UnmodifiableIterator() {}

  /**
   * Guaranteed to throw an exception and leave the underlying data unmodified.
   *
   * @throws UnsupportedOperationException always
   * @deprecated Unsupported operation.
   */
  @Deprecated
  @Override
  public final void remove() {
    throw new UnsupportedOperationException();
  }
}
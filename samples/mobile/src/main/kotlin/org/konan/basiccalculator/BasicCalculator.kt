/*
 * Copyright 2010-2017 JetBrains s.r.o.
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

package org.konan.basiccalculator

class BasicCalculator : ExpressionComposer<Double> {
    override fun number(value: Double) = value
    override fun plus(left: Double, right: Double) = left + right
    override fun minus(left: Double, right: Double) = left - right
    override fun mult(left: Double, right: Double) = left * right
    override fun div(left: Double, right: Double) = left / right
}

interface ExpressionComposer<E : Any> {
    fun number(value: Double): E
    fun plus(left: E, right: E): E
    fun minus(left: E, right: E): E
    fun mult(left: E, right: E): E
    fun div(left: E, right: E): E
}

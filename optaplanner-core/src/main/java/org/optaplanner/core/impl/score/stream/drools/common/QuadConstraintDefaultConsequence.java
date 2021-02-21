/*
 * Copyright 2021 Red Hat, Inc. and/or its affiliates.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.optaplanner.core.impl.score.stream.drools.common;

import static java.util.Objects.requireNonNull;

final class QuadConstraintDefaultConsequence<A, B, C, D> extends AbstractQuadConstraintConsequence<A, B, C, D> {

    private final QuadLeftHandSide<A, B, C, D> leftHandSide;

    QuadConstraintDefaultConsequence(QuadLeftHandSide<A, B, C, D> leftHandSide) {
        this.leftHandSide = requireNonNull(leftHandSide);
    }

    @Override
    protected QuadLeftHandSide<A, B, C, D> getLeftHandSide() {
        return leftHandSide;
    }

    @Override
    public ConsequenceMatchWeightType getMatchWeightType() {
        return ConsequenceMatchWeightType.DEFAULT;
    }

}
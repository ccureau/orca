/*
 * Copyright 2017 Netflix, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License")
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.netflix.spinnaker.orca.events;

import com.netflix.spinnaker.orca.ExecutionStatus;
import com.netflix.spinnaker.orca.pipeline.model.Execution;

public final class ExecutionComplete extends ExecutionEvent {
  private final ExecutionStatus status;

  public ExecutionComplete(Object source, Class<? extends Execution<?>> executionType, String executionId, ExecutionStatus status) {
    super(source, executionType, executionId);
    this.status = status;
  }

  public ExecutionStatus getStatus() {
    return status;
  }
}

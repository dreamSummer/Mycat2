/**
 * Copyright [2021] [chen junwen]
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package cn.mycat.vertx.xa;

/**
 * Mark the state of reach(ed)
 */
public enum State {
    XA_INITED(0),
    XA_STARTED(1),
    XA_ENDED(2),
    XA_PREPARED(3),

    XA_COMMITED(4),
    XA_ROLLBACKED(5)
    ;
    private int value;

    State(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
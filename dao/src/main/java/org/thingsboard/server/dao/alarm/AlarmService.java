/**
 * Copyright © 2016-2017 The Thingsboard Authors
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
package org.thingsboard.server.dao.alarm;

import com.google.common.util.concurrent.ListenableFuture;
import org.thingsboard.server.common.data.alarm.Alarm;
import org.thingsboard.server.common.data.alarm.AlarmId;
import org.thingsboard.server.common.data.alarm.AlarmInfo;
import org.thingsboard.server.common.data.alarm.AlarmQuery;
import org.thingsboard.server.common.data.page.TimePageData;

/**
 * Created by ashvayka on 11.05.17.
 */
public interface AlarmService {

    Alarm createOrUpdateAlarm(Alarm alarm);

    ListenableFuture<Boolean> ackAlarm(AlarmId alarmId, long ackTs);

    ListenableFuture<Boolean> clearAlarm(AlarmId alarmId, long ackTs);

    ListenableFuture<Alarm> findAlarmByIdAsync(AlarmId alarmId);

    ListenableFuture<TimePageData<AlarmInfo>> findAlarms(AlarmQuery query);

}

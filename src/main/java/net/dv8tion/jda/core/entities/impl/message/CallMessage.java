/*
 *     Copyright 2015-2017 Austin Keener & Michael Ritter & Florian Spieß
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

package net.dv8tion.jda.core.entities.impl.message;

import net.dv8tion.jda.client.entities.Group;
import net.dv8tion.jda.core.entities.*;

public class CallMessage extends SystemMessage
{
    public CallMessage(User author, MessageChannel channel, long messageId, String content)
    {
        super(author, channel, messageId, content);
    }

    public PrivateChannel getPrivateChannel()
    {
        return isFromType(ChannelType.PRIVATE) ? (PrivateChannel) channel : null;
    }

    public Group getGroup()
    {
        return isFromType(ChannelType.GROUP) ? (Group) channel : null;
    }

    @Override
    public MessageType getType()
    {
        return MessageType.CALL;
    }
}
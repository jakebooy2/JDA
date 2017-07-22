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

package net.dv8tion.jda.core.events.message.priv;

import net.dv8tion.jda.core.JDA;
import net.dv8tion.jda.core.entities.MessageType;
import net.dv8tion.jda.core.entities.PrivateChannel;
import net.dv8tion.jda.core.entities.User;
import net.dv8tion.jda.core.entities.impl.message.CallMessage;

public class PrivateCallMessageEvent extends GenericPrivateMessageEvent
{
    protected final CallMessage message;

    public PrivateCallMessageEvent(JDA api, long responseNumber, CallMessage message, PrivateChannel channel)
    {
        super(api, responseNumber, message.getIdLong(), channel);
        this.message = message;
    }

    public User getAuthor()
    {
        return message.getAuthor();
    }

    public MessageType getType()
    {
        return message.getType();
    }

    public CallMessage getMessage()
    {
        return message;
    }
}
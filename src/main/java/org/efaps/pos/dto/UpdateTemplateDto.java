/*
 * Copyright © 2003 - 2024 The eFaps Team (-)
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
package org.efaps.pos.dto;

import javax.annotation.processing.Generated;

import tools.jackson.databind.annotation.JsonDeserialize;

@JsonDeserialize(builder = UpdateTemplateDto.Builder.class)
public class UpdateTemplateDto
{

    private final String name;
    private final String templateOid;
    private final String targetPath;

    @Generated("SparkTools")
    private UpdateTemplateDto(Builder builder)
    {
        this.name = builder.name;
        this.templateOid = builder.templateOid;
        this.targetPath = builder.targetPath;
    }

    public String getTargetPath()
    {
        return targetPath;
    }

    public String getTemplateOid()
    {
        return templateOid;
    }

    public String getName()
    {
        return name;
    }

    @Override
    public String toString()
    {
        return new StringBuilder().append(this.getClass().getName())
                        .append(" [templateOid=").append(templateOid)
                        .append(", name=").append(name)
                        .append(", targetPath=").append(targetPath)
                        .append("]").toString();
    }

    @Generated("SparkTools")
    public static Builder builder()
    {
        return new Builder();
    }

    @Generated("SparkTools")
    public static final class Builder
    {

        private String name;
        private String templateOid;
        private String targetPath;

        private Builder()
        {
        }

        public Builder withName(String name)
        {
            this.name = name;
            return this;
        }

        public Builder withTemplateOid(String templateOid)
        {
            this.templateOid = templateOid;
            return this;
        }

        public Builder withTargetPath(String targetPath)
        {
            this.targetPath = targetPath;
            return this;
        }

        public UpdateTemplateDto build()
        {
            return new UpdateTemplateDto(this);
        }
    }
}

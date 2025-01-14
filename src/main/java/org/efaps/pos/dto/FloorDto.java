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

import java.util.Collections;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

@JsonDeserialize(builder = FloorDto.Builder.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class FloorDto
    extends AbstractObjectDto
{

    private final String name;

    private final List<SpotDto> spots;

    private final String imageOid;

    private FloorDto(final Builder _builder)
    {
        super(_builder);
        name = _builder.name;
        spots = _builder.spots == null ? Collections.emptyList() : Collections.unmodifiableList(_builder.spots);
        imageOid = _builder.imageOid;
    }

    public String getName()
    {
        return name;
    }

    public List<SpotDto> getSpots()
    {
        return spots;
    }

    public String getImageOid()
    {
        return imageOid;
    }

    @Override
    public String toString()
    {
        return new StringBuilder()
                        .append(super.toString())
                        .append(", name=").append(name)
                        .append(", spots=").append(spots)
                        .append(", imageOid=").append(imageOid)
                        .append("]").toString();
    }

    public static Builder builder()
    {
        return new Builder();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Builder
        extends AbstractObjectDto.Builder<Builder>
    {

        private String name;
        private List<SpotDto> spots;
        private String imageOid;

        public Builder withName(final String _name)
        {
            name = _name;
            return this;
        }

        public Builder withSpots(final List<SpotDto> _spots)
        {
            spots = _spots;
            return this;
        }

        public Builder withImageOid(final String _imageOid)
        {
            imageOid = _imageOid;
            return this;
        }

        public FloorDto build()
        {
            return new FloorDto(this);
        }
    }
}

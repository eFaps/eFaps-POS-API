/*
 * Copyright 2003 - 2021 The eFaps Team
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
 *
 */
package org.efaps.pos.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

@JsonDeserialize(builder = PrintCmdDto.Builder.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class PrintCmdDto
{

    private final String printerOid;
    private final PrintTarget target;
    private final String targetOid;
    private final String reportOid;

    private PrintCmdDto(final Builder _builder)
    {
        printerOid = _builder.printerOid;
        target = _builder.target;
        targetOid = _builder.targetOid;
        reportOid = _builder.reportOid;
    }

    public String getPrinterOid()
    {
        return printerOid;
    }

    public PrintTarget getTarget()
    {
        return target;
    }

    public String getTargetOid()
    {
        return targetOid;
    }


    public String getReportOid()
    {
        return reportOid;
    }

    @Override
    public String toString()
    {
        final StringBuilder builder2 = new StringBuilder();
        builder2.append("PrintCmdDto [printerOid=").append(printerOid).append(", target=").append(target)
                        .append(", targetOid=").append(targetOid).append(", reportOid=").append(reportOid).append("]");
        return builder2.toString();
    }

    public static Builder builder()
    {
        return new Builder();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder
    {

        private String printerOid;
        private PrintTarget target;
        private String targetOid;
        private String reportOid;

        public Builder withPrinterOid(final String _printerOid)
        {
            printerOid = _printerOid;
            return this;
        }

        public Builder withTarget(final PrintTarget _target)
        {
            target = _target;
            return this;
        }

        public Builder withTargetOid(final String _targetOid)
        {
            targetOid = _targetOid;
            return this;
        }

        public Builder withReportOid(final String _reportOid)
        {
            reportOid = _reportOid;
            return this;
        }

        public PrintCmdDto build()
        {
            return new PrintCmdDto(this);
        }
    }
}

package org.efaps.pos.dto;

import java.time.OffsetDateTime;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;


@JsonDeserialize(builder = StocktakingDto.Builder.class)
public class StocktakingDto
{
    private final String number;
    private final String userOid;
    private final OffsetDateTime startAt;
    private final OffsetDateTime endAt;
    private final StocktakingStatus status;
    private StocktakingDto(Builder builder)
    {
        this.number = builder.number;
        this.userOid = builder.userOid;
        this.startAt = builder.startAt;
        this.endAt = builder.endAt;
        this.status = builder.status;
    }
    public String getNumber()
    {
        return number;
    }

    public String getUserOid()
    {
        return userOid;
    }

    public OffsetDateTime getStartAt()
    {
        return startAt;
    }

    public OffsetDateTime getEndAt()
    {
        return endAt;
    }

    public StocktakingStatus getStatus()
    {
        return status;
    }

    public static Builder builder()
    {
        return new Builder();
    }

    public static final class Builder
    {

        private String number;
        private String userOid;
        private OffsetDateTime startAt;
        private OffsetDateTime endAt;
        private StocktakingStatus status;

        private Builder()
        {
        }

        public Builder withNumber(String number)
        {
            this.number = number;
            return this;
        }

        public Builder withUserOid(String userOid)
        {
            this.userOid = userOid;
            return this;
        }

        public Builder withStartAt(OffsetDateTime startAt)
        {
            this.startAt = startAt;
            return this;
        }

        public Builder withEndAt(OffsetDateTime endAt)
        {
            this.endAt = endAt;
            return this;
        }

        public Builder withStatus(StocktakingStatus status)
        {
            this.status = status;
            return this;
        }

        public StocktakingDto build()
        {
            return new StocktakingDto(this);
        }
    }

}

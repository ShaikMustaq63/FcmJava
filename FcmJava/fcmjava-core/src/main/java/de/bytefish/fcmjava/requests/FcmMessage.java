// Copyright (c) Philipp Wagner. All rights reserved.
// Licensed under the MIT license. See LICENSE file in the project root for full license information.

package de.bytefish.fcmjava.requests;

import com.fasterxml.jackson.annotation.JsonProperty;
import de.bytefish.fcmjava.model.enums.PriorityEnum;
import de.bytefish.fcmjava.model.options.FcmMessageOptions;
import java.lang.reflect.Type;

public abstract class FcmMessage<TPayload> {

    private final FcmMessageOptions options;

    public FcmMessage(FcmMessageOptions options) {
        if(options == null) {
            throw new IllegalArgumentException("options");
        }
        this.options = options;
    }

    @JsonProperty("condition")
    public String getCondition() {
        return options.getCondition();
    }

    @JsonProperty("collapse_key")
    public String getCollapseKey() {
        return options.getCollapseKey();
    }

    @JsonProperty("priority")
    public PriorityEnum getPriorityEnum() {
        return options.getPriorityEnum();
    }

    @JsonProperty("content_available")
    public Boolean getContentAvailable() {
        return options.getContentAvailable();
    }

    @JsonProperty("delay_while_idle")
    public Boolean getDelayWhileIdle() {
        return options.getDelayWhileIdle();
    }

    @JsonProperty("time_to_live")
    public int getTimeToLive() {
        return options.getTimeToLive();
    }

    @JsonProperty("restricted_package_name")
    public String getRestrictedPackageName() {
        return options.getRestrictedPackageName();
    }

    @JsonProperty("dry_run")
    public Boolean getDryRun() {
        return options.getDryRun();
    }

    public abstract TPayload getPayload();

}

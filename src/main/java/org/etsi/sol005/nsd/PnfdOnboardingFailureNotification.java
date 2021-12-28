package org.etsi.sol005.nsd;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.etsi.sol005.common.ProblemDetails;
import org.etsi.sol005.lifecyclemanagement.LccnLinks;

import java.time.OffsetDateTime;

/**
 * Represents a PNFD management notification, which informs the receiver of the failure of on-boarding a PNFD.
 * It shall comply with the provisions defined in table 5.5.2.14-1. The support of this notification is mandatory.
 * The notification is triggered when the on-boarding of a PNFD fails.
 */
@Data
@JsonInclude(value = JsonInclude.Include.NON_EMPTY, content = JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
@ApiModel(description = "Represents a PNFD management notification, which informs the receiver of the failure of on-boarding a PNFD.")
public class PnfdOnboardingFailureNotification implements PnfdManagementNotification {
    public static final String TYPE = "PnfdOnboardingFailureNotification";

    @ApiModelProperty(name = "Id", required = true, notes = "Identifier of this notification. If a notification is sent multiple times due to multiple subscriptions, the \"id\" attribute of all these notifications shall have the same value.")
    private String id;
    @ApiModelProperty(name = "Notification Type", required = true, notes = "Discriminator for the different notification types. Shall be set to \"PnfdOnboardingFailureNotification\" for this notification type.")
    private final String notificationType = TYPE;
    @ApiModelProperty(name = "Subscription Id", notes = "Identifier of the subscription that this notification relates to.")
    private String subscriptionId;
    @ApiModelProperty(name = "Notification Time", required = true, notes = "Date-time of the generation of the notification.")
    private OffsetDateTime timeStamp;
    @ApiModelProperty(name = "Pnfd Info Id", required = true, notes = "Identifier of the PNFD information object. This identifier is allocated by the NFVO.")
    private String pnfdInfoId;
    @ApiModelProperty(name = "Pnfd Id", required = true, notes = "This identifier, which is managed by the service provider, identifies the PNFD in a globally unique way. It is copied from the on-boarded PNFD.")
    private String pnfdId;
    @ApiModelProperty(name = "Onboarding Failure Details", required = true, notes = "Failure details of current onboarding procedure. See clause 6.3 of ETSI GS NFV-SOL 013 [16] for the details of ProblemDetails structure.")
    private ProblemDetails onboardingFailureDetails;
    @ApiModelProperty(name = "Links", required = true, notes = "Links to resources related to this notification.")
    @JsonProperty("_links")
    private LccnLinks links;
}

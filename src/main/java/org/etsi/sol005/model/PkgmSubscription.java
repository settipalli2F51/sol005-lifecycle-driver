package org.etsi.sol005.model;

import java.net.URI;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.Data;

/**
 * This type represents a subscription related to notifications about VNF package management. 
 */

@Data
@JsonInclude(value = JsonInclude.Include.NON_EMPTY, content = JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)

public class PkgmSubscription   {

  private String id;

  private PkgmNotificationsFilter filter;

  private URI callbackUri;

  private PkgmSubscriptionLinks links;
}


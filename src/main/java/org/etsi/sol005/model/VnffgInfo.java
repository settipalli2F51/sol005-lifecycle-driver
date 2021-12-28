package org.etsi.sol005.model;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.Data;

/**
 * Information on the VNFFG(s) of the NS instance. 
 */

@Data
@JsonInclude(value = JsonInclude.Include.NON_EMPTY, content = JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)

public class VnffgInfo   {

  private String id;

  private String vnffgdId;

  private List<String> vnfInstanceId = new ArrayList<>();

  private List<String> pnfdInfoId = null;

  private List<String> nsVirtualLinkInfoId = null;

  private List<NsCpHandle> nsCpHandle = null;
}


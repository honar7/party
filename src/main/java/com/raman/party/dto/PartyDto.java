package com.raman.party.dto;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Setter;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.xml.bind.annotation.XmlAccessorOrder;

@Getter
@Setter
@NoArgsConstructor
@ToString
@JsonInclude(value = JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class PartyDto {

    private String id;

    private int fare;

    private int journeyTime;

    private String sourceStopCode;

    private String sourceStopName;

    private String destinationStopCode;

    private String destinationStopName;

    private String busCode;

    private String agencyCode;

//    private long id;
//    private String firstName;
//    private String lastName;
//    private String fullName;
//    private long requestSubSystemId;
//    private int partyTypeCode;
//    private long partyNumber;
//    private String uniqueName;
//    private String latinName;
//    private String nationalityNumber;
//    private String economyNumber;
//    private String internalUniqueNumber;
//    private String imageUrl;
}

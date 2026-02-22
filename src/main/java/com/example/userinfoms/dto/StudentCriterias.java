package com.example.userinfoms.dto;

import java.util.List;

public record StudentCriterias(
        String desiredLevel,

        List<String> preferredCategories,

        Boolean remoteAllowed) {
}

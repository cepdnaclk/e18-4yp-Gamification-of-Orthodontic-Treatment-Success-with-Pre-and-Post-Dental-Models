package com.orthodontics.filemanagement.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PointRequest {
    private Long stl_id;
    private String point_name;
    private String coordinates;
}

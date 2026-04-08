package com.learn4you.notificationservice.model;

import lombok.*;
import lombok.experimental.FieldDefaults;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class MessageDTO {
    String to;
    String toName;
    String subject;
    String content;
}
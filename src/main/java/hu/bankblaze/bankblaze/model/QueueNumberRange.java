package hu.bankblaze.bankblaze.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class QueueNumberRange {
    private final int min;
    private final int max;
}
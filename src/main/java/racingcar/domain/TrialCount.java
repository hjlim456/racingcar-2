package racingcar.domain;

import racingcar.message.ErrorMessage;

public record TrialCount(int count) {
    public TrialCount {
        validateCount(count);
    }

    private static void validateCount(int count) {
        if (count <= 0) {
            throw new IllegalArgumentException(ErrorMessage.INVALIDATE_NUMBER.getMessage());
        }
    }

}

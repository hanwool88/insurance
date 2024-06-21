package untitled.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import untitled.domain.*;
import untitled.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class ClaimRequested extends AbstractEvent {

    private Long id;

    public ClaimRequested(Receipt aggregate) {
        super(aggregate);
    }

    public ClaimRequested() {
        super();
    }
}
//>>> DDD / Domain Event

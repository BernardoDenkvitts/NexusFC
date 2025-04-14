package com.nexusfc.api.Model;

import com.nexusfc.api.Model.Component.MatchHistory;
import com.nexusfc.api.Model.Enum.Lane;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "ProfessionalPlayers")
public class ProfessionalPlayer {
    @Id
    private String id;

    @Field("nick")
    private String nick;

    @Field("lane")
    private Lane lane;

    @Field("team")
    private String teamId;

    @Field("match_history")
    private List<MatchHistory> matchHistory;

    @Field("overall_kill")
    private Float overallKill;

    @Field("overall_death")
    private Float overallDeath;

    @Field("overall_assist")
    private Float overallAssist;

    @Field("overall_win_rate")
    private Float overallWinRate;

    @Field("cost")
    private Float cost;
}

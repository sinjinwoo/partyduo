package partyDuo.com.model;



import java.sql.Timestamp;

import lombok.Data;

@Data
public class PartyBoardVO {
	private int party_board_id;
	private int party_id;
	private int req_pwr;
	private String boss;
	private String party_board_memo;
	private String party_board_content;
	private String party_board_writer;
	private Timestamp party_board_wdate;
	
}

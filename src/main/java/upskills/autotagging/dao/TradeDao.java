package upskills.autotagging.dao;

import upskills.autotagging.model.Trade;
import upskills.autotagging.model.TradeId;


public interface TradeDao extends Dao<Trade> {
	public Trade getTradeByNbAndField(TradeId tradeId);
	public Integer deleteTradeByKey(TradeId tradeId);
}

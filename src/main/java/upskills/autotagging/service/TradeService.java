package upskills.autotagging.service;

import java.util.List;

import upskills.autotagging.model.Trade;
import upskills.autotagging.model.TradeId;

public interface TradeService {
	
	public List<Trade> getAllIssue();
	public void addNewTrade(Trade trade);
	public void updateTrade(Trade trade);
	public Integer deleteTrade(TradeId tradeId);
	public Boolean isTradeExist(TradeId tradeId);
	
}

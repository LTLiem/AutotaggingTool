package upskills.autotagging.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import upskills.autotagging.dao.TradeDao;
import upskills.autotagging.model.Trade;
import upskills.autotagging.model.TradeId;
import upskills.autotagging.service.TradeService;

@Service
public class TradeServiceImpl implements TradeService {

	@Autowired
	private TradeDao tradeDao;
	
	@Transactional
	public List<Trade> getAllIssue() {
		return tradeDao.getAll();
	}

	@Transactional
	public void addNewTrade(Trade trade) {
		tradeDao.create(trade);
	}

	@Transactional
	public void updateTrade(Trade trade) {
		tradeDao.update(trade);
	}

	@Transactional
	public Integer deleteTrade(TradeId tradeId) {
		return tradeDao.deleteTradeByKey(tradeId);
	}

	@Transactional
	public Boolean isTradeExist(TradeId tradeId) {
		Trade trade = null;
		
		trade = tradeDao.getTradeByNbAndField(tradeId);
		
		if(trade != null)
			return true;
		return false;
		
	}

}

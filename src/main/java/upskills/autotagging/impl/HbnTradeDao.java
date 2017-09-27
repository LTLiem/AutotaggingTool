package upskills.autotagging.impl;

import org.springframework.stereotype.Repository;

import upskills.autotagging.dao.TradeDao;
import upskills.autotagging.model.Trade;
import upskills.autotagging.model.TradeId;

@Repository
public class HbnTradeDao extends AbstractHbnDao<Trade> implements TradeDao {

	public Trade getTradeByNbAndField(TradeId tradeId) {
		Trade result = null;
		result = (Trade)getSession()
				 .getNamedQuery("getTradeByNbAndField")
				 .setParameter(0, tradeId.getNb())
				 //.setInteger("NB", tradeId.getNb()) //Deprecated
				 //.setString("field", tradeId.getField().trim()) //Deprecated
				 .setParameter(1, tradeId.getField())
				 .uniqueResult();
		return result;
	}
	
	/**
	 * Delete a row in trade table
	 * Return
	 * 		 > 0 : delete sucessful
	 * 		 = 0 : delete fail
	 */
	public Integer deleteTradeByKey(TradeId tradeId) {
		int result = -1;
		try {
			result = (Integer)getSession()
					.getNamedQuery("deleteTradeByKey")
					.setParameter(0, tradeId.getNb())
					.setParameter(1, tradeId.getField().trim())
					.executeUpdate();
		} catch(Exception e) {
			e.printStackTrace();
		}		
		return result;	
	}
}

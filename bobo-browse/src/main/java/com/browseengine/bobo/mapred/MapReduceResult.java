package com.browseengine.bobo.mapred;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Keeps the map reduce results
 *
 */
@SuppressWarnings("rawtypes")
public class MapReduceResult implements Serializable {
  /**
   *
   */
  private static final long serialVersionUID = 1L;
  protected List mapResults = new ArrayList(200);
  protected Serializable reduceResult;

  public List getMapResults() {
    return mapResults;
  }

  public MapReduceResult setMapResults(List mapResults) {
    this.mapResults = mapResults;
    return this;
  }

  public Serializable getReduceResult() {
    return reduceResult;
  }

  public MapReduceResult setReduceResult(Serializable reduceResult) {
    this.reduceResult = reduceResult;
    return this;
  }

}

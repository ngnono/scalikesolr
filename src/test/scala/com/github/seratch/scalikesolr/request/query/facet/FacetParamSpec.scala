package com.github.seratch.scalikesolr.request.query.facet

import org.scalatest._
import org.scalatest.matchers._

class FacetParamSpec extends FlatSpec with ShouldMatchers {

  behavior of "FacetParam"

  it should "be available" in {
    val field: Field = null
    val param: Param = null
    val value: Value = null
    val instance = new FacetParam(field, param, value)
    instance should not be null
  }

}

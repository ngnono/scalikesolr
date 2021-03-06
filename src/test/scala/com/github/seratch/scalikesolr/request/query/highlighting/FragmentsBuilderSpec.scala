package com.github.seratch.scalikesolr.request.query.highlighting

import org.scalatest._
import org.scalatest.matchers._

class FragmentsBuilderSpec extends FlatSpec with ShouldMatchers {

  behavior of "FragmentsBuilder"

  it should "be available" in {
    val fragmentsBuilder: String = ""
    val instance = new FragmentsBuilder(fragmentsBuilder)
    instance should not be null
    instance.getKey() should equal("hl.fragmentsBuilder")
  }

}

package com.github.seratch.scalikesolr.request.query.group

import org.scalatest._
import org.scalatest.matchers._

class GroupFormatSpec extends FlatSpec with ShouldMatchers {

  behavior of "GroupFormat"

  it should "be available" in {
    val format: String = ""
    val instance = new GroupFormat(format)
    instance should not be null
    instance.getKey() should equal("group.format")
  }

}

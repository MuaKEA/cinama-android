package dk.nodes.template.models

import com.google.gson.annotations.SerializedName

class ThrillerResualt(
@SerializedName("results")
var result : ArrayList<ThrillerInfo>





) {
    override fun toString(): String {
        return "ThrillerResualt(result=$result)"
    }
}

package com.alekseioshurkovdeveloper.about.domain.model

import com.alekseioshurkovdeveloper.network.model.about.Community
import com.alekseioshurkovdeveloper.network.model.leaders.Leader

data class FabricatedModel(val group: Community, val leaders: List<Leader>)
package pinkbunny.detekt

import io.gitlab.arturbosch.detekt.api.Config
import io.gitlab.arturbosch.detekt.api.RuleSet
import io.gitlab.arturbosch.detekt.api.RuleSetProvider

class PinkBunnyRuleSetProvider : RuleSetProvider {

    override val ruleSetId: String = "PinkBunny"

    override fun instance(config: Config): RuleSet {
        return RuleSet(
            ruleSetId,
            listOf(
                UseComposableActions()
            )
        )
    }
}

package kz.btsd.bot.scenario.sdk.template

import kz.btsd.bot.botscenariosdk.operations.SessionAwareOperations
import kz.btsd.bot.botscenariosdk.scenario.Scenario
import kz.btsd.bot.botscenariosdk.scenario.ScenarioEntryPoint
import kz.btsd.messenger.bot.api.model.update.Update

@Scenario(TemplateDispatcher::class, "/start", "start")
class StartScenario(
        dispatcher: TemplateDispatcher
) : SessionAwareOperations(dispatcher), ScenarioEntryPoint {

    override suspend fun start(update: Update) {
        sendMessage("Hello from template service")
    }
}

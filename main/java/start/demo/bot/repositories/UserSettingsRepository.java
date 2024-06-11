package start.demo.bot.repositories;

import start.demo.bot.models.UserSettings;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserSettingsRepository extends JpaRepository<UserSettings, Integer> {
    Optional<UserSettings> getUserSettingsByTelegramUserId(long telegramUserId);
    Optional<UserSettings> findUserSettingsByTelegramUserId(long telegramUserId);
}

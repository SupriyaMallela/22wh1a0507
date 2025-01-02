from selenium import webdriver
from selenium.webdriver.common.by import By  # Import the By class
import time

print("Test Execution Started")

options = webdriver.ChromeOptions()
options.add_argument('--ignore-ssl-errors=yes')
options.add_argument('--ignore-certificate-errors')

# Create a Remote WebDriver instance
driver = webdriver.Remote(
    command_executor='http://localhost:4444/wd/hub',
    options=options
)

# Maximize the window size
driver.maximize_window()
time.sleep(10)

# Navigate to browserstack.com
driver.get("https://www.browserstack.com/")
time.sleep(10)

# Click on the "Get started free" button using the updated method
driver.find_element(By.LINK_TEXT, "Get started free").click()

time.sleep(10)

# Close the browser
driver.close()
driver.quit()

print("Test Execution Successfully Completed!")

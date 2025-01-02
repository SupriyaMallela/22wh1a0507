const { Builder, By, until } = require('selenium-webdriver');
const chrome = require('selenium-webdriver/chrome');
const path = require('path');
(async function testJavaScript() {
    // Set up the Chrome WebDriver
    let driver = await new Builder().forBrowser('chrome').setChromeOptions(new chrome.Options()).build();
    try {
        // Open the local HTML file (adjust the path as needed)
        await driver.get('file://' + path.resolve(__dirname, 'index.html'));
        // Check initial greeting text
        let greetingText = await driver.findElement(By.id('greeting')).getText();
        console.log('Initial greeting: ' + greetingText); // Should print "Hello, World!"
        // Find the button and click it
        let button = await driver.findElement(By.id('changeText'));
        await button.click();
        // Wait for the greeting text to change
        await driver.wait(until.elementTextIs(driver.findElement(By.id('greeting')), 'Hello, Selenium!'), 5000);
        // Check if the greeting text is updated
        greetingText = await driver.findElement(By.id('greeting')).getText();
        console.log('Updated greeting: ' + greetingText); // Should print "Hello, Selenium!"
    } finally {
        // Quit the driver session
        await driver.quit();
    }
})();
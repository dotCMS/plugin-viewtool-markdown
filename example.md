This file is intended to demonstrate the capabilities of the dotCMS markdown plugin

#Markdown Basics
Markdown allows you to write using an easy-to-read, easy-to-write plain text format, which then converts to valid HTML for viewing on dotCMS.  This list of examples was taken from github.com, which has popularized markdown to the point that it has become a defacto web standard

##Basic writing

###Paragraphs

Paragraphs in Markdown are just one or more lines of consecutive text followed by one or more blank lines.

On July 2, an alien mothership entered Earth's orbit and deployed several dozen saucer-shaped "destroyer" spacecraft, each 15 miles (24 km) wide.

On July 3, the Black Knights, a squadron of Marine Corps F/A-18 Hornets, participated in an assault on a destroyer near the city of Los Angeles.

###Headings

You can create a heading by adding one or more # symbols before your heading text. The number of # you use will determine the size of the heading.

# The largest heading (an &lt;h1&gt; tag)
## The second largest heading (an &lt;h2&gt; tag)

###### The 6th largest heading (an &lt;h6&gt; tag)


###Blockquotes

You can indicate blockquotes with a >.

In the words of Abraham Lincoln:

> Pardon my french

###Styling text

You can make text bold or italic.

*This text will be italic*
**This text will be bold**


Both bold and italic can use either a * or an _ around the text for styling. This allows you to combine both bold and italic if needed.

**Everyone _must_ attend the meeting at 5 o'clock today.**


Strikethrough


~~Mistaken text.~~


##Lists

###Unordered lists

You can make an unordered list by preceding list items with either a * or a -.

* Item
* Item
* Item

- Item
- Item
- Item

###Ordered lists

You can make an ordered list by preceding list items with a number.

1. Item 1
2. Item 2
3. Item 3

###Nested lists

You can create nested lists by indenting list items by two spaces.

1. Item 1
  1. A corollary to the above item.
  2. Yet another point to consider.
2. Item 2
  * A corollary that does not need to be ordered.
    * This is indented four spaces, because it's two spaces further than the item above.
    * You might want to consider making a new list.
3. Item 3

## Code formatting

### Inline formats

Use single backticks (`) to format text in a special monospace format. Everything within the backticks appear as-is, with no other special formatting.

Here's an idea: why don't we take `SuperiorProject` and turn it into `**Reasonable**Project`.

### Multiple lines of Code

You can use triple backticks <b>```</b> before and after text to format it as its own distinct block.

Check out this neat program I wrote:

```
x = 0
x = 2 + 2
what is x
```

You can append a class="" element to your code block by typing the class you would like to append after the triple ticks, e.g.

Check out this javascript program I wrote:

```javascript
var _self = (typeof window !== 'undefined')
	? window   // if in browser
	: (
		(typeof WorkerGlobalScope !== 'undefined' && self instanceof WorkerGlobalScope)
		? self // if in worker
		: {}   // if in node js
	);

```



###Links

You can create an inline link by wrapping link text in brackets ( [ ] ), and then wrapping the link in parentheses ( ( ) ).

For example, to create a hyperlink to www.github.com, with a link text that says, Visit GitHub!, you'd write this in Markdown: [Visit GitHub!](https://www.github.com).


See also

##Auto Linking

Links are detected automatically and linked appropriately.

http://example.com


~~Mistaken text.~~

### Tables
You can create tables by assembling a list of words and dividing them with hyphens - (for the first row), and then separating each column with a pipe


| First Header  | Second Header |
| ------------- | ------------- |
| Content Cell  | Content Cell  |
| Content Cell  | Content Cell  |


You can also include inline Markdown such as links, bold, italics, or strikethrough:


| Name | Description          |
| ------------- | ----------- |
| Help      | ~~Display the~~ help window.|
| Close     | _Closes_ a window     |


Finally, by including colons : within the header row, you can define text to be left-aligned, right-aligned, or center-aligned:

| Left-Aligned  | Center Aligned  | Right Aligned |
| :------------ |:---------------:| -----:|
| col 3 is      | some wordy text | $1600 |
| col 2 is      | centered        |   $12 |
| zebra stripes | are neat        |    $1 |

##Images
Here is how images are embedded

![dotCMS logo](http://dotcms.com/images/logo.png)


